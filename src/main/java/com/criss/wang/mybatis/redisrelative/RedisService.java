package com.criss.wang.mybatis.redisrelative;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;

import java.util.concurrent.TimeUnit;

/**
 * @Author wangqiubao
 * @Date 2019/11/26 15:49
 * @Description
 **/
@Component
public class RedisService {

    @Autowired
    private RedisTemplate redisTemplate;

    // 将token存入在redis
    public String getToken() {
        String token = "token" + System.currentTimeMillis();
        redisTemplate.opsForValue().set(token, token, 30, TimeUnit.MINUTES);
        return token;
    }

    public boolean findToken(String tokenKey) {
        String token = (String) redisTemplate.opsForValue().get(tokenKey);
        if (StringUtils.isEmpty(token)) {
            return false;
        }
        // token 获取成功后 删除对应tokenMapstoken
        redisTemplate.delete(token);
        return true;
    }
}
