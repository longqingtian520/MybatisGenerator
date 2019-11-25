package com.criss.wang.mybatis;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.internal.DefaultShellCallback;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

@MapperScan("com.criss.wang.mybatis.XmlMapper")
@SpringBootApplication
public class MybatisGeneratorApplication {

    /**
     * @return void
     * @Author wangqiubao
     * @Date 2019/11/19
     * @Param [args]
     * @Description 测试主函数
     **/
    public static void main(String[] args) {
        SpringApplication.run(MybatisGeneratorApplication.class, args);
    }

    /**
     * @return void
     * @Author wangqiubao
     * @Date 2019/11/19
     * @Param [args]
     * @Description 自动生成代码主函数
     **/
    public static void main8(String[] args) throws Exception {
        MybatisGeneratorApplication app = new MybatisGeneratorApplication();

        System.out.println(app.getClass().getResource("/").getPath());
        app.generator();
        System.out.println(System.getProperty("user.dir"));
    }

    public void generator() throws Exception {

        List<String> warnings = new ArrayList<String>();
        boolean overwrite = true;
        InputStream resourceAsStream = this.getClass().getClassLoader().getResourceAsStream("generatorConfig.xml");
        ConfigurationParser cp = new ConfigurationParser(warnings);
        Configuration config = cp.parseConfiguration(resourceAsStream);
        DefaultShellCallback callback = new DefaultShellCallback(overwrite);
        MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
        myBatisGenerator.generate(null);

        for (String warning : warnings) {
            System.out.println(warning);
        }
    }

}
