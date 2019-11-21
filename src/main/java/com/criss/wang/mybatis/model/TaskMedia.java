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
public class TaskMedia extends BaseEntity implements Serializable {
    /**
     * id
     */
    private Long id;

    /**
     * 任务记录id
     */
    private Long hId;

    /**
     * 资源id
     */
    private String mediaId;

    /**
     * 媒体类型PHOTO = 1;     VIDEO = 2; 
     */
    private Integer mediaType;

    /**
     * 位置，sd卡，手机内存等SDCARD = 1;//SD卡   INTERNAL_STORAGE = 2;//机身内部存储 
     */
    private String location;

    /**
     * 成果类型TAKE_PHOTO = 1;//手动控制拍照     PANORAMA = 2;//全景     Orthophoto = 3;//正射     ObliquePhotography = 4;//倾斜 
     */
    private String source;

    /**
     * 不同成果执行多次的标识
     */
    private String eventId;

    /**
     * 创建时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date timeCreated;

    /**
     * 视频持续时间
     */
    private Float duration;

    /**
     * 时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdate;

    private static final long serialVersionUID = -2813795977917730426l;
}