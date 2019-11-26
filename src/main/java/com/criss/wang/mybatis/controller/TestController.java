package com.criss.wang.mybatis.controller;

import com.criss.wang.mybatis.annocustom.ExtApiIdempotent;
import com.criss.wang.mybatis.annocustom.ExtApiToken;
import com.criss.wang.mybatis.service.TestService;
import com.criss.wang.mybatis.utils.ConstantUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

import javax.servlet.http.HttpServletRequest;

/**
 * @Author wangqiubao
 * @Date 2019/11/19 10:13
 * @Description
 **/
@RestController
public class TestController {
    @Autowired
    private TestService testService;

    @Autowired
    private RedisTemplate redisTemplate;

    @Value("${service.wang.qiu.bao}")
    private String name;

    @Value("service.wang.qiu.bao:wangqiubao")
    private String nameEng;

    @Value("${service.wang.qiu.bao.wangqiubao:chris:wangqiubao}")
    private String nickName;

    @Value("${shepherd.key-names.task.shepherd.task:%s}")
    private String taskKey;

    @Value("${service.wang.qiu.bao.wang:wangqibuaowangqkibao}")
    private String child;

    @GetMapping("/test")
    public String test(@RequestParam(name = "id", required = false)long id)throws Exception{
        System.out.println(name);
        System.out.println(nameEng);
        System.out.println(nickName);
        System.out.println(String.format(taskKey, "D0202293"));
        System.out.println(child);
        redisTemplate.opsForValue().set("criss", "wangqiubao");
        return testService.test(id);
    }

    @GetMapping("/web/flux")
    public Mono<String> hello(){
        return Mono.just("Welcome to reactive world");
    }

    @RequestMapping("/indexPage")
    @ExtApiToken
    public String indexPage(HttpServletRequest req) {
        return "indexPage";
    }

    @RequestMapping("/addOrderPage")
    @ExtApiIdempotent(value = ConstantUtils.EXTAPIFROM)
    public String addOrder() {
//        int addOrder = orderMapper.addOrder(orderEntity);
//        return addOrder > 0 ? "success" : "fail";
        return null;
    }


}
