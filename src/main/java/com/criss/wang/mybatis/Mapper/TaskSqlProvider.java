package com.criss.wang.mybatis.Mapper;

import com.criss.wang.mybatis.model.TaskWithBLOBs;
import org.apache.ibatis.jdbc.SQL;

public class TaskSqlProvider {

    public String insertSelective(TaskWithBLOBs record) {
        SQL sql = new SQL();
        sql.INSERT_INTO("TB_TASK_INFO");
        
        if (record.getTkId() != null) {
            sql.VALUES("tk_id", "#{tkId,jdbcType=VARCHAR}");
        }
        
        if (record.getShepherdId() != null) {
            sql.VALUES("shepherd_id", "#{shepherdId,jdbcType=VARCHAR}");
        }
        
        if (record.getFenceId() != null) {
            sql.VALUES("fence_id", "#{fenceId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrthoId() != null) {
            sql.VALUES("ortho_id", "#{orthoId,jdbcType=VARCHAR}");
        }
        
        if (record.getUavId() != null) {
            sql.VALUES("uav_id", "#{uavId,jdbcType=VARCHAR}");
        }
        
        if (record.getUavType() != null) {
            sql.VALUES("uav_type", "#{uavType,jdbcType=BIT}");
        }
        
        if (record.getAirLineNum() != null) {
            sql.VALUES("air_line_num", "#{airLineNum,jdbcType=INTEGER}");
        }
        
        if (record.getFinishedCount() != null) {
            sql.VALUES("finished_count", "#{finishedCount,jdbcType=INTEGER}");
        }
        
        if (record.getTaskType() != null) {
            sql.VALUES("task_type", "#{taskType,jdbcType=BIT}");
        }
        
        if (record.getName() != null) {
            sql.VALUES("name", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.VALUES("status", "#{status,jdbcType=INTEGER}");
        }
        
        if (record.getPredictTime() != null) {
            sql.VALUES("predict_time", "#{predictTime,jdbcType=INTEGER}");
        }
        
        if (record.getPredictFlyDistance() != null) {
            sql.VALUES("predict_fly_distance", "#{predictFlyDistance,jdbcType=DOUBLE}");
        }
        
        if (record.getPredictBatteryNum() != null) {
            sql.VALUES("predict_battery_num", "#{predictBatteryNum,jdbcType=INTEGER}");
        }
        
        if (record.getPredictPictureNum() != null) {
            sql.VALUES("predict_picture_num", "#{predictPictureNum,jdbcType=INTEGER}");
        }
        
        if (record.getPredictHeight() != null) {
            sql.VALUES("predict_height", "#{predictHeight,jdbcType=INTEGER}");
        }
        
        if (record.getPredictSpeed() != null) {
            sql.VALUES("predict_speed", "#{predictSpeed,jdbcType=DOUBLE}");
        }
        
        if (record.getPredictBackHeight() != null) {
            sql.VALUES("predict_back_height", "#{predictBackHeight,jdbcType=INTEGER}");
        }
        
        if (record.getFinishAction() != null) {
            sql.VALUES("finish_action", "#{finishAction,jdbcType=INTEGER}");
        }
        
        if (record.getBattery() != null) {
            sql.VALUES("battery", "#{battery,jdbcType=REAL}");
        }
        
        if (record.getPictureNum() != null) {
            sql.VALUES("picture_num", "#{pictureNum,jdbcType=INTEGER}");
        }
        
        if (record.getHeight() != null) {
            sql.VALUES("height", "#{height,jdbcType=DOUBLE}");
        }
        
        if (record.getSpeed() != null) {
            sql.VALUES("speed", "#{speed,jdbcType=DOUBLE}");
        }
        
        if (record.getAwayFromStart() != null) {
            sql.VALUES("away_from_start", "#{awayFromStart,jdbcType=DOUBLE}");
        }
        
        if (record.getHeadingMode() != null) {
            sql.VALUES("heading_mode", "#{headingMode,jdbcType=INTEGER}");
        }
        
        if (record.getCourseLapover() != null) {
            sql.VALUES("course_lapover", "#{courseLapover,jdbcType=REAL}");
        }
        
        if (record.getSideLapover() != null) {
            sql.VALUES("side_lapover", "#{sideLapover,jdbcType=REAL}");
        }
        
        if (record.getPrincipalRowAngle() != null) {
            sql.VALUES("principal_row_angle", "#{principalRowAngle,jdbcType=REAL}");
        }
        
        if (record.getEdgeDis() != null) {
            sql.VALUES("edge_dis", "#{edgeDis,jdbcType=REAL}");
        }
        
        if (record.getGeodesicPointStr() != null) {
            sql.VALUES("geodesic_point_str", "#{geodesicPointStr,jdbcType=VARCHAR}");
        }
        
        if (record.getRecordTime() != null) {
            sql.VALUES("record_time", "#{recordTime,jdbcType=DOUBLE}");
        }
        
        if (record.getShootPhotoType() != null) {
            sql.VALUES("shoot_photo_type", "#{shootPhotoType,jdbcType=INTEGER}");
        }
        
        if (record.getWayPointsStr() != null) {
            sql.VALUES("way_points_str", "#{wayPointsStr,jdbcType=VARCHAR}");
        }
        
        if (record.getLastWaypointStr() != null) {
            sql.VALUES("last_waypoint_str", "#{lastWaypointStr,jdbcType=VARCHAR}");
        }
        
        if (record.getLastWayPointIndex() != null) {
            sql.VALUES("last_way_point_index", "#{lastWayPointIndex,jdbcType=INTEGER}");
        }
        
        if (record.getGoHomeWayPointIndex() != null) {
            sql.VALUES("go_home_way_point_index", "#{goHomeWayPointIndex,jdbcType=INTEGER}");
        }
        
        if (record.getGoingBackPointStr() != null) {
            sql.VALUES("going_back_point_str", "#{goingBackPointStr,jdbcType=VARCHAR}");
        }
        
        if (record.getProgress() != null) {
            sql.VALUES("progress", "#{progress,jdbcType=INTEGER}");
        }
        
        if (record.getParentId() != null) {
            sql.VALUES("parent_id", "#{parentId,jdbcType=VARCHAR}");
        }
        
        if (record.getGoBacked() != null) {
            sql.VALUES("go_backed", "#{goBacked,jdbcType=BIT}");
        }
        
        if (record.getHasBack() != null) {
            sql.VALUES("has_back", "#{hasBack,jdbcType=BIT}");
        }
        
        if (record.getAirAdjustFlag() != null) {
            sql.VALUES("air_adjust_flag", "#{airAdjustFlag,jdbcType=BIT}");
        }
        
        if (record.getBufferRangeStr() != null) {
            sql.VALUES("buffer_range_str", "#{bufferRangeStr,jdbcType=VARCHAR}");
        }
        
        if (record.getSafeRangeStr() != null) {
            sql.VALUES("safe_range_str", "#{safeRangeStr,jdbcType=VARCHAR}");
        }
        
        if (record.getMaxSpeed() != null) {
            sql.VALUES("max_speed", "#{maxSpeed,jdbcType=INTEGER}");
        }
        
        if (record.getFreeSpeed() != null) {
            sql.VALUES("free_speed", "#{freeSpeed,jdbcType=INTEGER}");
        }
        
        if (record.getDeleted() != null) {
            sql.VALUES("deleted", "#{deleted,jdbcType=BIT}");
        }
        
        if (record.getStarttime() != null) {
            sql.VALUES("starttime", "#{starttime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndtime() != null) {
            sql.VALUES("endtime", "#{endtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrgId() != null) {
            sql.VALUES("org_id", "#{orgId,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedate() != null) {
            sql.VALUES("createdate", "#{createdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedate() != null) {
            sql.VALUES("updatedate", "#{updatedate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getHomePointStr() != null) {
            sql.VALUES("home_point_str", "#{homePointStr,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getHistoryPointBytes() != null) {
            sql.VALUES("history_point_bytes", "#{historyPointBytes,jdbcType=LONGVARBINARY}");
        }
        
        return sql.toString();
    }

    public String updateByPrimaryKeySelective(TaskWithBLOBs record) {
        SQL sql = new SQL();
        sql.UPDATE("TB_TASK_INFO");
        
        if (record.getTkId() != null) {
            sql.SET("tk_id = #{tkId,jdbcType=VARCHAR}");
        }
        
        if (record.getShepherdId() != null) {
            sql.SET("shepherd_id = #{shepherdId,jdbcType=VARCHAR}");
        }
        
        if (record.getFenceId() != null) {
            sql.SET("fence_id = #{fenceId,jdbcType=VARCHAR}");
        }
        
        if (record.getOrthoId() != null) {
            sql.SET("ortho_id = #{orthoId,jdbcType=VARCHAR}");
        }
        
        if (record.getUavId() != null) {
            sql.SET("uav_id = #{uavId,jdbcType=VARCHAR}");
        }
        
        if (record.getUavType() != null) {
            sql.SET("uav_type = #{uavType,jdbcType=BIT}");
        }
        
        if (record.getAirLineNum() != null) {
            sql.SET("air_line_num = #{airLineNum,jdbcType=INTEGER}");
        }
        
        if (record.getFinishedCount() != null) {
            sql.SET("finished_count = #{finishedCount,jdbcType=INTEGER}");
        }
        
        if (record.getTaskType() != null) {
            sql.SET("task_type = #{taskType,jdbcType=BIT}");
        }
        
        if (record.getName() != null) {
            sql.SET("name = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getStatus() != null) {
            sql.SET("status = #{status,jdbcType=INTEGER}");
        }
        
        if (record.getPredictTime() != null) {
            sql.SET("predict_time = #{predictTime,jdbcType=INTEGER}");
        }
        
        if (record.getPredictFlyDistance() != null) {
            sql.SET("predict_fly_distance = #{predictFlyDistance,jdbcType=DOUBLE}");
        }
        
        if (record.getPredictBatteryNum() != null) {
            sql.SET("predict_battery_num = #{predictBatteryNum,jdbcType=INTEGER}");
        }
        
        if (record.getPredictPictureNum() != null) {
            sql.SET("predict_picture_num = #{predictPictureNum,jdbcType=INTEGER}");
        }
        
        if (record.getPredictHeight() != null) {
            sql.SET("predict_height = #{predictHeight,jdbcType=INTEGER}");
        }
        
        if (record.getPredictSpeed() != null) {
            sql.SET("predict_speed = #{predictSpeed,jdbcType=DOUBLE}");
        }
        
        if (record.getPredictBackHeight() != null) {
            sql.SET("predict_back_height = #{predictBackHeight,jdbcType=INTEGER}");
        }
        
        if (record.getFinishAction() != null) {
            sql.SET("finish_action = #{finishAction,jdbcType=INTEGER}");
        }
        
        if (record.getBattery() != null) {
            sql.SET("battery = #{battery,jdbcType=REAL}");
        }
        
        if (record.getPictureNum() != null) {
            sql.SET("picture_num = #{pictureNum,jdbcType=INTEGER}");
        }
        
        if (record.getHeight() != null) {
            sql.SET("height = #{height,jdbcType=DOUBLE}");
        }
        
        if (record.getSpeed() != null) {
            sql.SET("speed = #{speed,jdbcType=DOUBLE}");
        }
        
        if (record.getAwayFromStart() != null) {
            sql.SET("away_from_start = #{awayFromStart,jdbcType=DOUBLE}");
        }
        
        if (record.getHeadingMode() != null) {
            sql.SET("heading_mode = #{headingMode,jdbcType=INTEGER}");
        }
        
        if (record.getCourseLapover() != null) {
            sql.SET("course_lapover = #{courseLapover,jdbcType=REAL}");
        }
        
        if (record.getSideLapover() != null) {
            sql.SET("side_lapover = #{sideLapover,jdbcType=REAL}");
        }
        
        if (record.getPrincipalRowAngle() != null) {
            sql.SET("principal_row_angle = #{principalRowAngle,jdbcType=REAL}");
        }
        
        if (record.getEdgeDis() != null) {
            sql.SET("edge_dis = #{edgeDis,jdbcType=REAL}");
        }
        
        if (record.getGeodesicPointStr() != null) {
            sql.SET("geodesic_point_str = #{geodesicPointStr,jdbcType=VARCHAR}");
        }
        
        if (record.getRecordTime() != null) {
            sql.SET("record_time = #{recordTime,jdbcType=DOUBLE}");
        }
        
        if (record.getShootPhotoType() != null) {
            sql.SET("shoot_photo_type = #{shootPhotoType,jdbcType=INTEGER}");
        }
        
        if (record.getWayPointsStr() != null) {
            sql.SET("way_points_str = #{wayPointsStr,jdbcType=VARCHAR}");
        }
        
        if (record.getLastWaypointStr() != null) {
            sql.SET("last_waypoint_str = #{lastWaypointStr,jdbcType=VARCHAR}");
        }
        
        if (record.getLastWayPointIndex() != null) {
            sql.SET("last_way_point_index = #{lastWayPointIndex,jdbcType=INTEGER}");
        }
        
        if (record.getGoHomeWayPointIndex() != null) {
            sql.SET("go_home_way_point_index = #{goHomeWayPointIndex,jdbcType=INTEGER}");
        }
        
        if (record.getGoingBackPointStr() != null) {
            sql.SET("going_back_point_str = #{goingBackPointStr,jdbcType=VARCHAR}");
        }
        
        if (record.getProgress() != null) {
            sql.SET("progress = #{progress,jdbcType=INTEGER}");
        }
        
        if (record.getParentId() != null) {
            sql.SET("parent_id = #{parentId,jdbcType=VARCHAR}");
        }
        
        if (record.getGoBacked() != null) {
            sql.SET("go_backed = #{goBacked,jdbcType=BIT}");
        }
        
        if (record.getHasBack() != null) {
            sql.SET("has_back = #{hasBack,jdbcType=BIT}");
        }
        
        if (record.getAirAdjustFlag() != null) {
            sql.SET("air_adjust_flag = #{airAdjustFlag,jdbcType=BIT}");
        }
        
        if (record.getBufferRangeStr() != null) {
            sql.SET("buffer_range_str = #{bufferRangeStr,jdbcType=VARCHAR}");
        }
        
        if (record.getSafeRangeStr() != null) {
            sql.SET("safe_range_str = #{safeRangeStr,jdbcType=VARCHAR}");
        }
        
        if (record.getMaxSpeed() != null) {
            sql.SET("max_speed = #{maxSpeed,jdbcType=INTEGER}");
        }
        
        if (record.getFreeSpeed() != null) {
            sql.SET("free_speed = #{freeSpeed,jdbcType=INTEGER}");
        }
        
        if (record.getDeleted() != null) {
            sql.SET("deleted = #{deleted,jdbcType=BIT}");
        }
        
        if (record.getStarttime() != null) {
            sql.SET("starttime = #{starttime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEndtime() != null) {
            sql.SET("endtime = #{endtime,jdbcType=TIMESTAMP}");
        }
        
        if (record.getOrgId() != null) {
            sql.SET("org_id = #{orgId,jdbcType=VARCHAR}");
        }
        
        if (record.getCreatedate() != null) {
            sql.SET("createdate = #{createdate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getUpdatedate() != null) {
            sql.SET("updatedate = #{updatedate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getHomePointStr() != null) {
            sql.SET("home_point_str = #{homePointStr,jdbcType=LONGVARCHAR}");
        }
        
        if (record.getHistoryPointBytes() != null) {
            sql.SET("history_point_bytes = #{historyPointBytes,jdbcType=LONGVARBINARY}");
        }
        
        sql.WHERE("id = #{id,jdbcType=BIGINT}");
        
        return sql.toString();
    }
}