package com.criss.wang.mybatis.XmlMapper;

import com.criss.wang.mybatis.model.TaskMedia;
import org.apache.ibatis.annotations.Mapper;

/**
* @Author wangqiubao
* @Date 2019/11/21 16:52:12
* @Description
*/
@Mapper
public interface TaskMediaMapper {
    int deleteByPrimaryKey(Long id);

    int insert(TaskMedia record);

    int insertSelective(TaskMedia record);

    TaskMedia selectByTaskHistoryId(Long id);

    int updateByPrimaryKeySelective(TaskMedia record);

    int updateByPrimaryKey(TaskMedia record);
}