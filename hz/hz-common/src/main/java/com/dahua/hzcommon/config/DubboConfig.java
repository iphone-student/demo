package com.dahua.hzcommon.config;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableDubbo(scanBasePackageClasses = "com.dahua.")
public class DubboConfig {
}
