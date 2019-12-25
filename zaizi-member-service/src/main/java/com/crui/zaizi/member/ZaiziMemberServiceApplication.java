package com.crui.zaizi.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.crui.zaizi.member.mapper")
public class ZaiziMemberServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZaiziMemberServiceApplication.class, args);
    }

}
