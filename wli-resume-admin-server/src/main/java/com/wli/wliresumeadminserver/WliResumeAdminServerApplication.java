package com.wli.wliresumeadminserver;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAdminServer
public class WliResumeAdminServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(WliResumeAdminServerApplication.class, args);
    }

}
