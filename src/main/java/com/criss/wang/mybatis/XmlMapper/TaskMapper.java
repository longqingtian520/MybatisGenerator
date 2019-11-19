package com.criss.wang.mybatis.XmlMapper;

import com.criss.wang.mybatis.model.Task;
import com.criss.wang.mybatis.model.TaskWithBLOBs;
import org.apache.ibatis.annotations.Mapper;

/**
* Created by wangqiubao on 2019/11/19 11:15:40
*/
@Mapper
public interface TaskMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TaskWithBLOBs record);

    int insertSelective(TaskWithBLOBs record);

    TaskWithBLOBs selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(TaskWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(TaskWithBLOBs record);

    int updateByPrimaryKey(Task record);
}