package com.criss.wang.mybatis.model;

import java.io.Serializable;
import java.util.Date;

public class Task implements Serializable {
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
    private Date starttime;

    /**
     * 任务结束时间
     */
    private Date endtime;

    /**
     * 归属企业/组织
     */
    private String orgId;

    /**
     * 
     */
    private Date createdate;

    /**
     * 
     */
    private Date updatedate;

    private static final long serialVersionUID = 1L;

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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTkId() {
        return tkId;
    }

    public void setTkId(String tkId) {
        this.tkId = tkId == null ? null : tkId.trim();
    }

    public String getShepherdId() {
        return shepherdId;
    }

    public void setShepherdId(String shepherdId) {
        this.shepherdId = shepherdId == null ? null : shepherdId.trim();
    }

    public String getFenceId() {
        return fenceId;
    }

    public void setFenceId(String fenceId) {
        this.fenceId = fenceId == null ? null : fenceId.trim();
    }

    public String getOrthoId() {
        return orthoId;
    }

    public void setOrthoId(String orthoId) {
        this.orthoId = orthoId == null ? null : orthoId.trim();
    }

    public String getUavId() {
        return uavId;
    }

    public void setUavId(String uavId) {
        this.uavId = uavId == null ? null : uavId.trim();
    }

    public Boolean getUavType() {
        return uavType;
    }

    public void setUavType(Boolean uavType) {
        this.uavType = uavType;
    }

    public Integer getAirLineNum() {
        return airLineNum;
    }

    public void setAirLineNum(Integer airLineNum) {
        this.airLineNum = airLineNum;
    }

    public Integer getFinishedCount() {
        return finishedCount;
    }

    public void setFinishedCount(Integer finishedCount) {
        this.finishedCount = finishedCount;
    }

    public Boolean getTaskType() {
        return taskType;
    }

    public void setTaskType(Boolean taskType) {
        this.taskType = taskType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPredictTime() {
        return predictTime;
    }

    public void setPredictTime(Integer predictTime) {
        this.predictTime = predictTime;
    }

    public Double getPredictFlyDistance() {
        return predictFlyDistance;
    }

    public void setPredictFlyDistance(Double predictFlyDistance) {
        this.predictFlyDistance = predictFlyDistance;
    }

    public Integer getPredictBatteryNum() {
        return predictBatteryNum;
    }

    public void setPredictBatteryNum(Integer predictBatteryNum) {
        this.predictBatteryNum = predictBatteryNum;
    }

    public Integer getPredictPictureNum() {
        return predictPictureNum;
    }

    public void setPredictPictureNum(Integer predictPictureNum) {
        this.predictPictureNum = predictPictureNum;
    }

    public Integer getPredictHeight() {
        return predictHeight;
    }

    public void setPredictHeight(Integer predictHeight) {
        this.predictHeight = predictHeight;
    }

    public Double getPredictSpeed() {
        return predictSpeed;
    }

    public void setPredictSpeed(Double predictSpeed) {
        this.predictSpeed = predictSpeed;
    }

    public Integer getPredictBackHeight() {
        return predictBackHeight;
    }

    public void setPredictBackHeight(Integer predictBackHeight) {
        this.predictBackHeight = predictBackHeight;
    }

    public Integer getFinishAction() {
        return finishAction;
    }

    public void setFinishAction(Integer finishAction) {
        this.finishAction = finishAction;
    }

    public Float getBattery() {
        return battery;
    }

    public void setBattery(Float battery) {
        this.battery = battery;
    }

    public Integer getPictureNum() {
        return pictureNum;
    }

    public void setPictureNum(Integer pictureNum) {
        this.pictureNum = pictureNum;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getSpeed() {
        return speed;
    }

    public void setSpeed(Double speed) {
        this.speed = speed;
    }

    public Double getAwayFromStart() {
        return awayFromStart;
    }

    public void setAwayFromStart(Double awayFromStart) {
        this.awayFromStart = awayFromStart;
    }

    public Integer getHeadingMode() {
        return headingMode;
    }

    public void setHeadingMode(Integer headingMode) {
        this.headingMode = headingMode;
    }

    public Float getCourseLapover() {
        return courseLapover;
    }

    public void setCourseLapover(Float courseLapover) {
        this.courseLapover = courseLapover;
    }

    public Float getSideLapover() {
        return sideLapover;
    }

    public void setSideLapover(Float sideLapover) {
        this.sideLapover = sideLapover;
    }

    public Float getPrincipalRowAngle() {
        return principalRowAngle;
    }

    public void setPrincipalRowAngle(Float principalRowAngle) {
        this.principalRowAngle = principalRowAngle;
    }

    public Float getEdgeDis() {
        return edgeDis;
    }

    public void setEdgeDis(Float edgeDis) {
        this.edgeDis = edgeDis;
    }

    public String getGeodesicPointStr() {
        return geodesicPointStr;
    }

    public void setGeodesicPointStr(String geodesicPointStr) {
        this.geodesicPointStr = geodesicPointStr == null ? null : geodesicPointStr.trim();
    }

    public Double getRecordTime() {
        return recordTime;
    }

    public void setRecordTime(Double recordTime) {
        this.recordTime = recordTime;
    }

    public Integer getShootPhotoType() {
        return shootPhotoType;
    }

    public void setShootPhotoType(Integer shootPhotoType) {
        this.shootPhotoType = shootPhotoType;
    }

    public String getWayPointsStr() {
        return wayPointsStr;
    }

    public void setWayPointsStr(String wayPointsStr) {
        this.wayPointsStr = wayPointsStr == null ? null : wayPointsStr.trim();
    }

    public String getLastWaypointStr() {
        return lastWaypointStr;
    }

    public void setLastWaypointStr(String lastWaypointStr) {
        this.lastWaypointStr = lastWaypointStr == null ? null : lastWaypointStr.trim();
    }

    public Integer getLastWayPointIndex() {
        return lastWayPointIndex;
    }

    public void setLastWayPointIndex(Integer lastWayPointIndex) {
        this.lastWayPointIndex = lastWayPointIndex;
    }

    public Integer getGoHomeWayPointIndex() {
        return goHomeWayPointIndex;
    }

    public void setGoHomeWayPointIndex(Integer goHomeWayPointIndex) {
        this.goHomeWayPointIndex = goHomeWayPointIndex;
    }

    public String getGoingBackPointStr() {
        return goingBackPointStr;
    }

    public void setGoingBackPointStr(String goingBackPointStr) {
        this.goingBackPointStr = goingBackPointStr == null ? null : goingBackPointStr.trim();
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId == null ? null : parentId.trim();
    }

    public Boolean getGoBacked() {
        return goBacked;
    }

    public void setGoBacked(Boolean goBacked) {
        this.goBacked = goBacked;
    }

    public Boolean getHasBack() {
        return hasBack;
    }

    public void setHasBack(Boolean hasBack) {
        this.hasBack = hasBack;
    }

    public Boolean getAirAdjustFlag() {
        return airAdjustFlag;
    }

    public void setAirAdjustFlag(Boolean airAdjustFlag) {
        this.airAdjustFlag = airAdjustFlag;
    }

    public String getBufferRangeStr() {
        return bufferRangeStr;
    }

    public void setBufferRangeStr(String bufferRangeStr) {
        this.bufferRangeStr = bufferRangeStr == null ? null : bufferRangeStr.trim();
    }

    public String getSafeRangeStr() {
        return safeRangeStr;
    }

    public void setSafeRangeStr(String safeRangeStr) {
        this.safeRangeStr = safeRangeStr == null ? null : safeRangeStr.trim();
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(Integer maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Integer getFreeSpeed() {
        return freeSpeed;
    }

    public void setFreeSpeed(Integer freeSpeed) {
        this.freeSpeed = freeSpeed;
    }

    public Boolean getDeleted() {
        return deleted;
    }

    public void setDeleted(Boolean deleted) {
        this.deleted = deleted;
    }

    public Date getStarttime() {
        return starttime;
    }

    public void setStarttime(Date starttime) {
        this.starttime = starttime;
    }

    public Date getEndtime() {
        return endtime;
    }

    public void setEndtime(Date endtime) {
        this.endtime = endtime;
    }

    public String getOrgId() {
        return orgId;
    }

    public void setOrgId(String orgId) {
        this.orgId = orgId == null ? null : orgId.trim();
    }

    public Date getCreatedate() {
        return createdate;
    }

    public void setCreatedate(Date createdate) {
        this.createdate = createdate;
    }

    public Date getUpdatedate() {
        return updatedate;
    }

    public void setUpdatedate(Date updatedate) {
        this.updatedate = updatedate;
    }
}