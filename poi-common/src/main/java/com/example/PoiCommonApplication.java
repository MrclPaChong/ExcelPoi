package com.example;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.vo")
public class PoiCommonApplication {

    public static void main(String[] args) {
        SpringApplication.run(PoiCommonApplication.class, args);
    }

}
