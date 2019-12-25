package com.crui.zaizi.manage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan(basePackages = "com.crui.zaizi.manage.mapper")
public class ZaiziManageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZaiziManageServiceApplication.class, args);
    }

}
