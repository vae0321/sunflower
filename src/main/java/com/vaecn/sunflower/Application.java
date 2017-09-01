package com.vaecn.sunflower;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by sifan on 2017/8/30.
 */
@SpringBootApplication
@MapperScan("com.vaecn.sunflower.mapper")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
