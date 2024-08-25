package com.service.unified_development_power_platform;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UnifiedDevelopmentPowerPlatformApplication {

	@Value("${unifieddevelopmentpowerplatform.name}")
	private String unifiedDevelopmentPowerPlatformApplication;

	public static void main(String[] args) {
		SpringApplication.run(UnifiedDevelopmentPowerPlatformApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {
		return runner -> {
			System.out.println(unifiedDevelopmentPowerPlatformApplication);
		};
	}
}
