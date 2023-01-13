package com.example.ipstackwebapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication(scanBasePackages = {"com.example.ipstackdata"})
public class IpStackWebApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(IpStackWebApiApplication.class, args);
    }

}
