package com.mylearn.springcloud.alibaba.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author xu
 * @date 2023/8/18
 */
@Configuration
@MapperScan({"com.mylearn.springcloud.alibaba.dao"})
public class MyBatisConfig {
}
