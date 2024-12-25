package com.service.unified_development_power_platform;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import com.service.unified_development_power_platform.Application.Configurations.YamlSourceFactory;

@SpringBootApplication
@EnableConfigurationProperties
@PropertySources({ @PropertySource(value = "classpath:udpp.yml", factory = YamlSourceFactory.class) })
public class UnifiedDevelopmentPowerPlatformApplication {

	@Value("${application.title}")
	private String _unifiedDevelopmentPowerPlatformApplication;

	public static void main(String[] args) {
		SpringApplication.run(UnifiedDevelopmentPowerPlatformApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(String[] args) {
		return runner -> {
			System.out.println("***************************");
			System.out.println("1, 2, 3 ...");
			System.out.println("The " + _unifiedDevelopmentPowerPlatformApplication.toUpperCase() + " start.");
			System.out.println("***************************");
		};
	}
}
