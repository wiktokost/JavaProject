package com.example.ipstackwebapi;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.config.BootstrapMode;
import org.springframework.stereotype.Component;

@SpringBootApplication
@ComponentScan(basePackages = {"com.example.*"})
public class IpStackWebApiApplication implements ApplicationRunner {
    private static final Logger logger = LogManager.getLogger(IpStackWebApiApplication.class);
    public static void main(String[] args) {
        SpringApplication.run(IpStackWebApiApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.trace("Log level: TRACE");
        logger.info("Log level: INFO");
        logger.debug("Log level: DEBUG");
        logger.error("Log level: ERROR");
        logger.warn("Log level: WARN");
    }
}
