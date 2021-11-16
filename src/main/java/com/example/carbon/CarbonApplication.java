package com.example.carbon;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("mapper")
@SpringBootApplication
public class CarbonApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarbonApplication.class, args);
    }

}
