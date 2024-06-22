package com.hloong.usercenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.hloong.usercenter.mapper")
public class usercenterApplication {

    public static void main(String[] args) {
        SpringApplication.run(usercenterApplication.class, args);
    }

}
