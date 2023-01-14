package com.example.ipstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example"})
public class IpStackClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(IpStackClientApplication.class, args);
    }

}
