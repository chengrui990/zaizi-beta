package com.crui.zaizi.member;

//import org.mybatis.spring.annotation.MapperScan;  //注意
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.crui.zaizi.member.mapper")
public class ZaiziMemberApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZaiziMemberApplication.class, args);
    }

}
