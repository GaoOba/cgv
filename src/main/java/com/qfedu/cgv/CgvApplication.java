package com.qfedu.cgv;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.qianfeng.cgv.dao")
public class CgvApplication {

    public static void main(String[] args) {
        SpringApplication.run(CgvApplication.class, args);
    }

}
