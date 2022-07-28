package com.dahua.hzcommon;

import org.apache.ibatis.annotations.Mapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
//@EnableCaching //启动缓存
@MapperScan("com.dahua.hzcommon.mapper")
public class HzCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(HzCommonApplication.class, args);
    }

}
