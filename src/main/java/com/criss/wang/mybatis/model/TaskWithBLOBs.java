package com.criss.wang.mybatis.model;

import java.io.Serializable;
import java.util.Date;

public class TaskWithBLOBs extends Task implements Serializable {
    /**
     * 任务起点经纬度
     */
    private String homePointStr;

    /**
     * l历史点字节
     */
    private byte[] historyPointBytes;

    private static final long serialVersionUID = 1L;

    public TaskWithBLOBs(Long id, String tkId, String shepherdId, String fenceId, String orthoId, String uavId, Boolean uavType, Integer airLineNum, Integer finishedCount, Boolean taskType, String name, Integer status, Integer predictTime, Double predictFlyDistance, Integer predictBatteryNum, Integer predictPictureNum, Integer predictHeight, Double predictSpeed, Integer predictBackHeight, Integer finishAction, Float battery, Integer pictureNum, Double height, Double speed, Double awayFromStart, Integer headingMode, Float courseLapover, Float sideLapover, Float principalRowAngle, Float edgeDis, String geodesicPointStr, Double recordTime, Integer shootPhotoType, String wayPointsStr, String lastWaypointStr, Integer lastWayPointIndex, Integer goHomeWayPointIndex, String goingBackPointStr, Integer progress, String parentId, Boolean goBacked, Boolean hasBack, Boolean airAdjustFlag, String bufferRangeStr, String safeRangeStr, Integer maxSpeed, Integer freeSpeed, Boolean deleted, Date starttime, Date endtime, String orgId, Date createdate, Date updatedate, String homePointStr, byte[] historyPointBytes) {
        super(id, tkId, shepherdId, fenceId, orthoId, uavId, uavType, airLineNum, finishedCount, taskType, name, status, predictTime, predictFlyDistance, predictBatteryNum, predictPictureNum, predictHeight, predictSpeed, predictBackHeight, finishAction, battery, pictureNum, height, speed, awayFromStart, headingMode, courseLapover, sideLapover, principalRowAngle, edgeDis, geodesicPointStr, recordTime, shootPhotoType, wayPointsStr, lastWaypointStr, lastWayPointIndex, goHomeWayPointIndex, goingBackPointStr, progress, parentId, goBacked, hasBack, airAdjustFlag, bufferRangeStr, safeRangeStr, maxSpeed, freeSpeed, deleted, starttime, endtime, orgId, createdate, updatedate);
        this.homePointStr = homePointStr;
        this.historyPointBytes = historyPointBytes;
    }

    public TaskWithBLOBs() {
        super();
    }

    public String getHomePointStr() {
        return homePointStr;
    }

    public void setHomePointStr(String homePointStr) {
        this.homePointStr = homePointStr == null ? null : homePointStr.trim();
    }

    public byte[] getHistoryPointBytes() {
        return historyPointBytes;
    }

    public void setHistoryPointBytes(byte[] historyPointBytes) {
        this.historyPointBytes = historyPointBytes;
    }
}