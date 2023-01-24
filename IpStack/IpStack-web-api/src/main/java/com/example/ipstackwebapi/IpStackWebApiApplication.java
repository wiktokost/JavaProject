package com.example.ipstackwebapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.*"})
public class IpStackWebApiApplication{
    public static void main(String[] args) {
        SpringApplication.run(IpStackWebApiApplication.class, args);
    }

}
