package com.criss.wang.mybatis.XmlMapper;

import com.criss.wang.mybatis.model.TaskHistory;
import org.apache.ibatis.annotations.Mapper;

/**
* @Author wangqiubao
* @Date 2019/11/19 16:14:41
* @Description
*/
@Mapper
public interface TaskHistoryMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TaskHistory record);

    int insertSelective(TaskHistory record);

    TaskHistory selectByTaskHistoryId(Long id);

    int updateByPrimaryKeySelective(TaskHistory record);

    int updateByPrimaryKey(TaskHistory record);
}