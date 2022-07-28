package com.dahua.redis;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.dahua.redis.mapper")
@EnableCaching
public class HzRedisApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzRedisApplication.class, args);
    }

}
