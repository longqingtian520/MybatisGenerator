package com.criss.wang.mybatis.model;

import com.criss.wang.mybatis.base.BaseEntity;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.format.annotation.DateTimeFormat;

/**
* Created by wangqiubao on 2019/11/19 11:15:40
*/
@Data
@Builder
@EqualsAndHashCode
public class Task extends BaseEntity implements Serializable {
    /**
     * 任务id
     */
    private Long id;

    /**
     * 加密后的id
     */
    private String tkId;

    /**
     * 项目Id
     */
    private String shepherdId;

    /**
     * 电子围栏id
     */
    private String fenceId;

    /**
     * 正射影像id
     */
    private String orthoId;

    /**
     * 无人机编号
     */
    private String uavId;

    /**
     * 无人机类型 1：APP；2：onboard
     */
    private Boolean uavType;

    /**
     * 航线序号 1；2；3
     */
    private Integer airLineNum;

    /**
     * 当前已经执行完的航线数量
     */
    private Integer finishedCount;

    /**
     * /** 任务类型 0:航点任务；1：热点任务；2：全景任务；3：跟随任务
     */
    private Boolean taskType;

    /**
     * 任务名称
     */
    private String name;

    /**
     * 状态：1进行中，2已结束
     */
    private Integer status;

    /**
     * 预计用时，里程/飞行速度；单位：秒
     */
    private Integer predictTime;

    /**
     * 预计飞行里程，航点连线后的总里程；单位：米
     */
    private Double predictFlyDistance;

    /**
     * 预计使用电池数量，预计用时/15分钟；连接无人机后根据无人机型号性能做区分
     */
    private Integer predictBatteryNum;

    /**
     * 预计图片数量，航点飞行类型任务因是手动拍摄，所以默认为0
     */
    private Integer predictPictureNum;

    /**
     * 预计飞行高度，默认飞行高度-100米（单位：米），暂定范围：0~500米（此为飞起点的相对高度，所以后续需支持负数）
     */
    private Integer predictHeight;

    /**
     * 预计飞行速度，默认10米/秒
     */
    private Double predictSpeed;

    /**
     * 返航高度
     */
    private Integer predictBackHeight;

    /**
     * 任务结束后的动作，默认1，自动返航
     */
    private Integer finishAction;

    /**
     * 实时电量，百分比
     */
    private Float battery;

    /**
     * 实时拍照数量
     */
    private Integer pictureNum;

    /**
     * 实时高度，米
     */
    private Double height;

    /**
     * 实时速度，米/秒
     */
    private Double speed;

    /**
     * 和起飞点的实时距离，米
     */
    private Double awayFromStart;

    /**
     * 机头操作模式
     */
    private Integer headingMode;

    /**
     * 航向重叠率
     */
    private Float courseLapover;

    /**
     * 旁向重叠率
     */
    private Float sideLapover;

    /**
     * 主行线角度
     */
    private Float principalRowAngle;

    /**
     * 边距
     */
    private Float edgeDis;

    /**
     * 测区坐标点
     */
    private String geodesicPointStr;

    /**
     * 实时飞行的用时，单位分
     */
    private Double recordTime;

    /**
     * 拍照方式
     */
    private Integer shootPhotoType;

    /**
     * 任务航点，经度，纬度...
     */
    private String wayPointsStr;

    /**
     * 最后一次经过的坐标点
     */
    private String lastWaypointStr;

    /**
     * 最后一次经过的航点编号
     */
    private Integer lastWayPointIndex;

    /**
     * 返航时更新的航点编号
     */
    private Integer goHomeWayPointIndex;

    /**
     * 返航时的经纬度
     */
    private String goingBackPointStr;

    /**
     * 任务百分比
     */
    private Integer progress;

    /**
     * 父任务ID
     */
    private String parentId;

    /**
     * 是否触发了返航指令
     */
    private Boolean goBacked;

    /**
     * 是否包含中途返航
     */
    private Boolean hasBack;

    /**
     * 在空中调整航线标识
     */
    private Boolean airAdjustFlag;

    /**
     * 电子围栏缓冲区
     */
    private String bufferRangeStr;

    /**
     * 安全缓冲区
     */
    private String safeRangeStr;

    /**
     * 最大飞行速度
     */
    private Integer maxSpeed;

    /**
     * 自由飞行速度
     */
    private Integer freeSpeed;

    /**
     * 删除标志 1：已删除；0：未删除
     */
    private Boolean deleted;

    /**
     * 任务开始时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date starttime;

    /**
     * 任务结束时间
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date endtime;

    /**
     * 归属企业/组织
     */
    private String orgId;

    /**
     * 
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createdate;

    /**
     * 
     */
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    @DateTimeFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date updatedate;

    private static final long serialVersionUID = -5532713737695161426l;

    public Task(Long id, String tkId, String shepherdId, String fenceId, String orthoId, String uavId, Boolean uavType, Integer airLineNum, Integer finishedCount, Boolean taskType, String name, Integer status, Integer predictTime, Double predictFlyDistance, Integer predictBatteryNum, Integer predictPictureNum, Integer predictHeight, Double predictSpeed, Integer predictBackHeight, Integer finishAction, Float battery, Integer pictureNum, Double height, Double speed, Double awayFromStart, Integer headingMode, Float courseLapover, Float sideLapover, Float principalRowAngle, Float edgeDis, String geodesicPointStr, Double recordTime, Integer shootPhotoType, String wayPointsStr, String lastWaypointStr, Integer lastWayPointIndex, Integer goHomeWayPointIndex, String goingBackPointStr, Integer progress, String parentId, Boolean goBacked, Boolean hasBack, Boolean airAdjustFlag, String bufferRangeStr, String safeRangeStr, Integer maxSpeed, Integer freeSpeed, Boolean deleted, Date starttime, Date endtime, String orgId, Date createdate, Date updatedate) {
        this.id = id;
        this.tkId = tkId;
        this.shepherdId = shepherdId;
        this.fenceId = fenceId;
        this.orthoId = orthoId;
        this.uavId = uavId;
        this.uavType = uavType;
        this.airLineNum = airLineNum;
        this.finishedCount = finishedCount;
        this.taskType = taskType;
        this.name = name;
        this.status = status;
        this.predictTime = predictTime;
        this.predictFlyDistance = predictFlyDistance;
        this.predictBatteryNum = predictBatteryNum;
        this.predictPictureNum = predictPictureNum;
        this.predictHeight = predictHeight;
        this.predictSpeed = predictSpeed;
        this.predictBackHeight = predictBackHeight;
        this.finishAction = finishAction;
        this.battery = battery;
        this.pictureNum = pictureNum;
        this.height = height;
        this.speed = speed;
        this.awayFromStart = awayFromStart;
        this.headingMode = headingMode;
        this.courseLapover = courseLapover;
        this.sideLapover = sideLapover;
        this.principalRowAngle = principalRowAngle;
        this.edgeDis = edgeDis;
        this.geodesicPointStr = geodesicPointStr;
        this.recordTime = recordTime;
        this.shootPhotoType = shootPhotoType;
        this.wayPointsStr = wayPointsStr;
        this.lastWaypointStr = lastWaypointStr;
        this.lastWayPointIndex = lastWayPointIndex;
        this.goHomeWayPointIndex = goHomeWayPointIndex;
        this.goingBackPointStr = goingBackPointStr;
        this.progress = progress;
        this.parentId = parentId;
        this.goBacked = goBacked;
        this.hasBack = hasBack;
        this.airAdjustFlag = airAdjustFlag;
        this.bufferRangeStr = bufferRangeStr;
        this.safeRangeStr = safeRangeStr;
        this.maxSpeed = maxSpeed;
        this.freeSpeed = freeSpeed;
        this.deleted = deleted;
        this.starttime = starttime;
        this.endtime = endtime;
        this.orgId = orgId;
        this.createdate = createdate;
        this.updatedate = updatedate;
    }

    public Task() {
        super();
    }
}