package com.example.ipstackwebapi;

import lombok.extern.log4j.Log4j;
import lombok.extern.log4j.Log4j2;
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
@Log4j2
public class IpStackWebApiApplication implements ApplicationRunner {
    public static void main(String[] args) {
        SpringApplication.run(IpStackWebApiApplication.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
          log.info("Log level: INFO");
          log.trace("Log level: TRACE");
          log.debug("Log level: DEBUG");
          log.error("Log level: ERROR");
          log.warn("Log level: WARN");
    }
}
