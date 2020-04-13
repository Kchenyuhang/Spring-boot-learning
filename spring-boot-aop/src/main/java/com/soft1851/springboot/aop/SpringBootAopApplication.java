package com.soft1851.springboot.aop;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@MapperScan("com.soft1851.springboot.aop.mapper")
@ServletComponentScan("com.soft1851.springboot.aop.config")
public class SpringBootAopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootAopApplication.class, args);
    }

}
