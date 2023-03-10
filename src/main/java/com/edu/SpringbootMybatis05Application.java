package com.edu;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


    @SpringBootApplication
    @MapperScan("com.edu.dao")
    public class SpringbootMybatis05Application {

        public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatis05Application.class, args);
    }

}
