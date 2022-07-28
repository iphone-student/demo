package com.dahua.hzcommon.config;



import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.ArrayList;

@Configuration
@EnableSwagger2
public class SwaggerConfig  {
    //配置swagger的Docket 的bean实例
    @Bean
    public Docket docket(){


        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                //配置分组
                .groupName("zb")
                //enable是否启动swagger
                .enable(true)
                .select()
                //RequestHandlerSelectors,配置要扫描接口的方式
                //basePackage,指定要扫描的包
                //any（），扫描全部
                //none（），不扫描
                //withClassAnnotation,扫描类上的注解
                //withMethodAnnotation,扫描方法上的注解
//                .apis(RequestHandlerSelectors.any())
                .apis(RequestHandlerSelectors.basePackage("com.dahua.hzcommon.controller"))
                //paths（），过滤
                .paths(PathSelectors.any())
                .build()
                ;
    }
    //配置swagger信息=apiInfo
    private ApiInfo apiInfo(){
        //作者信息
        Contact contact = new Contact("zb","http:adfaef.com","11231.qq.com");
        return new ApiInfo(
                "zb","详情","1.0","",contact,"","",new ArrayList()
        );
    }

}