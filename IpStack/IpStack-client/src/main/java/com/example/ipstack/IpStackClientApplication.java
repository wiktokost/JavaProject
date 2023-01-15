package com.example.ipstack;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

@SpringBootApplication(scanBasePackages = {"com.example.ipstackdata"})
public class IpStackClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(IpStackClientApplication.class, args);
    }

}
