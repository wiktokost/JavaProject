package com.example.ipstackdata;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class IpStackDataApplication {

    public static void main(String[] args) {
        SpringApplication.run(IpStackDataApplication.class, args);
    }

}
