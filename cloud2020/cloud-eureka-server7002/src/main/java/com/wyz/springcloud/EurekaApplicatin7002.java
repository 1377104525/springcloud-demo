package com.wyz.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer         //开启EurekaServer
public class EurekaApplicatin7002 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaApplicatin7002.class, args);
    }
}

