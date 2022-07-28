package com.dahua.hzrabbitmq;

import org.junit.jupiter.api.Test;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.HashMap;
import java.util.Map;

@SpringBootTest
class HzRabbitmqApplicationTests {

    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Test
    void contextLoads() {

        Map<String,Object> map = new HashMap<>();
        map.put("msg","xiaoxi");
        map.put("data","x dfadsfadfadiaoxi");
        rabbitTemplate.convertAndSend("exchange.direct","atguigu.news",map);
        rabbitTemplate.receiveAndConvert("atguigu.news");
    }

}
