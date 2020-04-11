package com.xull.mystringboot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.xull.mystringboot.mapper")
public class MystringbootApplication {

    public static void main(String[] args) {
        SpringApplication.run(MystringbootApplication.class, args);
    }

}
