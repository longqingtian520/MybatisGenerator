package com.criss.wang.mybatis.generator;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.mybatis.generator.api.IntrospectedColumn;
import org.mybatis.generator.api.IntrospectedTable;
import org.mybatis.generator.api.dom.java.*;
import org.mybatis.generator.plugins.SerializablePlugin;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

/**
 * @Author wangqiubao
 * @Date 2019/11/18 16:35
 * @Description
 **/
public class MyGeneratorPlugin extends SerializablePlugin {

    @Override
    public boolean validate(List<String> list) {
        return true;
    }

    /**
     * 序列号
     **/
    @Override
    protected void makeSerializable(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        FullyQualifiedJavaType serializable = new FullyQualifiedJavaType("java.io.Serializable");

        topLevelClass.addImportedType(serializable);
        topLevelClass.addSuperInterface(serializable);
        Field field = new Field();
        field.setFinal(true);
        field.setInitializationString(new Random().nextLong() + "l");
        field.setName("serialVersionUID");
        field.setStatic(true);
        field.setType(new FullyQualifiedJavaType("long"));
        field.setVisibility(JavaVisibility.PRIVATE);
        this.context.getCommentGenerator().addFieldComment(field, introspectedTable);
        topLevelClass.addField(field);


    }

    @Override
    public boolean modelBaseRecordClassGenerated(TopLevelClass topLevelClass, IntrospectedTable introspectedTable) {
        // 序列化
        this.makeSerializable(topLevelClass, introspectedTable);

        //添加domain的import
        topLevelClass.addImportedType("lombok.Data");
        topLevelClass.addImportedType("lombok.Builder");
        topLevelClass.addImportedType("lombok.EqualsAndHashCode");
        topLevelClass.addImportedType("lombok.AllArgsConstructor");
        topLevelClass.addImportedType("lombok.NoArgsConstructor");


        //添加domain的注解
        topLevelClass.addAnnotation("@Data");
        topLevelClass.addAnnotation("@Builder");
        topLevelClass.addAnnotation("@EqualsAndHashCode(callSuper = true)");
        topLevelClass.addAnnotation("@AllArgsConstructor");
        topLevelClass.addAnnotation("@NoArgsConstructor");

        //添加domain的注释
        topLevelClass.addJavaDocLine("/**");
        topLevelClass.addJavaDocLine("* @Author wangqiubao");
        topLevelClass.addJavaDocLine("* @Date " + date2Str(new Date()));
        topLevelClass.addJavaDocLine("* @Description");
        topLevelClass.addJavaDocLine("*/");


        // 判断实体类或表中有没有时间
        List<Field> fields = topLevelClass.getFields();
        for (Field field : fields) {
            if (field.getType().equals(FullyQualifiedJavaType.getDateInstance())) {
                topLevelClass.addImportedType("java.util.Date");
                topLevelClass.addImportedType("com.fasterxml.jackson.annotation.JsonFormat");
                topLevelClass.addImportedType("org.springframework.format.annotation.DateTimeFormat");
            }
        }

        // 修改Mapper文件中selectByPrimaryKey方法名 -- TODO 很有局限性，需要针对每个表修改
        introspectedTable.setSelectByPrimaryKeyStatementId("selectByTaskHistoryId");
        return true;
    }

    // Mapper文件的注释
    @Override
    public boolean clientGenerated(Interface interfaze, TopLevelClass topLevelClass,
                                   IntrospectedTable introspectedTable) {

        interfaze.addJavaDocLine("/**");
        interfaze.addJavaDocLine("* @Author wangqiubao");
        interfaze.addJavaDocLine("* @Date " + date2Str(new Date()));
        interfaze.addJavaDocLine("* @Description");
        interfaze.addJavaDocLine("*/");

        // 添加Mapper注解
        if (interfaze.getType().getShortName().endsWith("Mapper")) {
            interfaze.addImportedType(new FullyQualifiedJavaType("org.apache.ibatis.annotations.Mapper"));
            interfaze.addAnnotation("@Mapper");
        }

        // 修改Xml文件中selectByPrimaryKey方法名 -- TODO 很有局限性，需要针对每个表修改
        introspectedTable.setSelectByPrimaryKeyStatementId("selectByTaskHistoryId");

        return true;
    }

    @Override
    public boolean modelSetterMethodGenerated(Method method, TopLevelClass topLevelClass,
                                              IntrospectedColumn introspectedColumn,
                                              IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        //不生成getter
        return false;
    }

    @Override
    public boolean modelGetterMethodGenerated(Method method, TopLevelClass topLevelClass,
                                              IntrospectedColumn introspectedColumn,
                                              IntrospectedTable introspectedTable, ModelClassType modelClassType) {
        //不生成setter
        return false;
    }

    private String date2Str(Date date) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        return sdf.format(date);
    }
}
