package com.example.ipstackwebapi;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.*"})
public class IpStackWebApiApplication /*implements ApplicationRunner*/ {
    public static void main(String[] args) {
        SpringApplication.run(IpStackWebApiApplication.class, args);
    }

//    @Override
//    public void run(ApplicationArguments args) throws Exception {
//          log.info("Log level: INFO");
//          log.trace("Log level: TRACE");
//          log.debug("Log level: DEBUG");
//          log.error("Log level: ERROR");
//          log.warn("Log level: WARN");
//    }
}
