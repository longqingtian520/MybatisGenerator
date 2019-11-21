package com.criss.wang.mybatis;

import com.criss.wang.mybatis.controller.TestController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.reactive.WebFluxTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.reactive.server.WebTestClient;

@SpringBootTest
@RunWith(SpringRunner.class)
@WebFluxTest(controllers = TestController.class)
public class MybatisGeneratorApplicationTests {

    @Autowired
    WebTestClient client;

    @Test
    public void getHello() {
        client.get().uri("/hello").exchange().expectStatus().isOk();
    }

}
