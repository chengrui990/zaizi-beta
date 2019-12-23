package com.crui.zaizi.member;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.crui.zaizi.member.mapper")
public class ZaiziMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZaiziMemberApplication.class, args);
    }

}
