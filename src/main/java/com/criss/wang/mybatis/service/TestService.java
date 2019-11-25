package com.criss.wang.mybatis.service;

import com.criss.wang.mybatis.XmlMapper.TaskHistoryMapper;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author wangqiubao
 * @Date 2019/11/19 10:14
 * @Description
 **/
@Service
public class TestService {
    @Autowired
    private ObjectMapper objectMapper;
    @Autowired
    private TaskHistoryMapper taskMapper;

    public String test(long id) throws Exception {
        return objectMapper.writeValueAsString(taskMapper.selectByTaskHistoryId(id));
    }
}
