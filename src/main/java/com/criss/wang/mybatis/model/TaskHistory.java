package com.criss.wang.mybatis.model;

import com.criss.wang.mybatis.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

/**
* @Author wangqiubao
* @Date 2019/11/21 16:52:12
* @Description
*/
@Data
@Builder
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
@NoArgsConstructor
public class TaskHistory extends BaseEntity implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 任务id
     */
    private String tkId;

    /**
     * 任务类型
     */
    private Integer taskType;

    /**
     * 用户id
     */
    private Long usrId;

    /**
     * 企业id
     */
    private String orgId;

    /**
     * 上传标识
     */
    private Boolean uploadFlag;

    /**
     * 无人机id
     */
    private String uavId;

    /**
     * 飞行时间
     */
    private Float flyTime;

    /**
     * 飞行距离
     */
    private Float flyDistance;

    /**
     * 插入时间（任务开始时间）
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createtime;

    /**
     * 结束时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date endtime;

    /**
     * 更新时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatetime;

    private static final long serialVersionUID = -1752383169485056136l;
}