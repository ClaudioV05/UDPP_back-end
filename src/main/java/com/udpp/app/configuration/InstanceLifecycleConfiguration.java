package com.udpp.app.configuration;

import com.udpp.app.adapter.inbound.api.mapper.MetaDataDto;
import com.udpp.app.application.service.*;
import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/// The Instance Lifecycle.
/// @since 1.0
/// @author Claudiomildo Ventura.
@Configuration
public class InstanceLifecycleConfiguration {
	@Bean
	ArchitectureService createArchitectureService() {
		return new ArchitectureService();
	}

	@Bean
	DatabaseEngineerService createDatabaseEngineerService() {
		return new DatabaseEngineerService();
	}

	@Bean
	DatabaseService createDatabaseService() {
		return new DatabaseService();
	}

	@Bean
	DevelopmentEnvironmentService createDevelopmentEnvironmentService() {
		return new DevelopmentEnvironmentService();
	}

	@Bean
	MetadataFieldService createMetadataFieldService() {
		return new MetadataFieldService();
	}

	@Bean
	MetadataService createMetadataService() {
		return new MetadataService(
			   new ModelMapper(),
			   new MetaDataDto(),
			   new ArchitectureService(),
			   new DatabaseService(),
			   new DatabaseEngineerService(),
			   new DevelopmentEnvironmentService(),
			   new ParameterService(new UnicodeService()),
			   new ValidationService());
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