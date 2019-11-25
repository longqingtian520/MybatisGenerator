package com.criss.wang.mybatis.controller;

import com.criss.wang.mybatis.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * @Author wangqiubao
 * @Date 2019/11/19 10:13
 * @Description
 **/
@RestController
public class TestController {
    @Autowired
    private TestService testService;

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
        return testService.test(id);
    }

    @GetMapping("/web/flux")
    public Mono<String> hello(){
        return Mono.just("Welcome to reactive world");
    }

}
