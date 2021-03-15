package com.wli.wliresumeservicescms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.wli.wliresumeservicescms.mapper")
public class WliResumeServicesCmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(WliResumeServicesCmsApplication.class, args);
    }

}
