package com.mylearn.springcloud.config;


import feign.Logger;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * OpenFeignClient配置
 *
 * @author xu
 * @date 2023/8/8
 */
@Configuration
public class FeignConfig {
    @Bean
    public Logger.Level feignLoggerLevel(){
        //请求和响应的头信息，请求和响应的正文及元数据
        return Logger.Level.FULL;
    }
}
