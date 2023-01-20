package com.example.ipstackupdater;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.ipstackdata"})
public class IpStackUpdaterApplication {

	public static void main(String[] args) {
		SpringApplication.run(IpStackUpdaterApplication.class, args);
	}

}
