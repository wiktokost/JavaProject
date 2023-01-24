package com.example.ipstackupdater;

import com.example.ipstackupdater.updater.IUpdateGeolocation;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.example.*"})

public class IpStackUpdaterApplication implements CommandLineRunner {

	private final IUpdateGeolocation updater;

	public IpStackUpdaterApplication(IUpdateGeolocation updater) {
		this.updater = updater;
	}

	public static void main(String[] args) {
		SpringApplication.run(IpStackUpdaterApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		updater.updateByIp("82.199.155.188");
	}
}
