package com.sun.zq.springbootdemo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@Configuration
@ComponentScan(basePackages = "com.sun.zq")
@EnableJpaRepositories(basePackages = "com.sun.zq.dao")
@MapperScan("com.sun.zq.dao")
@EntityScan("com.sun.zq.model")
public class JpaConfiguration {
}
