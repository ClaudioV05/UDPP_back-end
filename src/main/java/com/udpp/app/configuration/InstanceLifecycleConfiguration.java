package com.udpp.app.configuration;

import com.udpp.app.application.service.*;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

/// The Instance Lifecycle.
/// @since 1.0
/// @author Claudiomildo Ventura.
@Configuration
public class InstanceLifecycleConfiguration {
	@Bean
	ArchitectureService createArchitectureService() {
		return new ArchitectureService(new UnicodeService());
	}

	@Bean
	DatabaseEngineerService createDatabaseEngineerService() {
		return new DatabaseEngineerService(new UnicodeService());
	}

	@Bean
	DatabaseService createDatabaseService() {
		return new DatabaseService(new UnicodeService());
	}

	@Bean
	DevelopmentEnvironmentService createDevelopmentEnvironmentService() {
		return new DevelopmentEnvironmentService(new UnicodeService());
	}

	@Bean
	FormService createFormService() {
		return new FormService(new UnicodeService());
	}

	@Bean
	MetadataFieldService createMetadataFieldService() {
		return new MetadataFieldService();
	}

	@Bean
	@Lazy
	MetadataService createMetadataService() {
		return new MetadataService(
			   new ArchitectureService(new UnicodeService()),
			   new DatabaseService(new UnicodeService()),
			   new DatabaseEngineerService(new UnicodeService()),
			   new DevelopmentEnvironmentService(new UnicodeService()),
			   new ParameterService(new UnicodeService()),
			   new ValidationService(),
			   new MapperService(new ModelMapper()),
			   new FormService(new UnicodeService()));
	}

	@Bean
	MetadataTableService createMetadataTableService() {
		return new MetadataTableService();
	}

	@Bean
	ParameterService createParameterService() {
		return new ParameterService(new UnicodeService());
	}

	@Bean
	UnicodeService createUnicodeService() {
		return new UnicodeService();
	}

	@Bean
	ValidationService createValidationService() {
		return new ValidationService();
	}

	@Bean
	LogService createLogService() {
		return new LogService();
	}
}