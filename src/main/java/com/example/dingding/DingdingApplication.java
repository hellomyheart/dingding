package com.example.dingding;

import com.example.dingding.commons.controller.ControllerUtill;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@MapperScan(basePackages = "com.example.dingding.mapper")
@EnableTransactionManagement
@ServletComponentScan
public class DingdingApplication {

    public static void main(String[] args) {
        SpringApplication.run(DingdingApplication.class, args);
    }

    @Bean
    public ControllerUtill controllerUtils(){
        return new ControllerUtill();
    }

}
