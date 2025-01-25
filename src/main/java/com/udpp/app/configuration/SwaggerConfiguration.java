package com.udpp.app.configuration;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.ExternalDocumentation;

@Configuration
public class SwaggerConfiguration {

	private final Swagger _swagger;
	
	@Autowired
	SwaggerConfiguration(Swagger swagger) {
		_swagger = swagger;
	}

	@Bean
	OpenAPI openApiDetails() {
		return new OpenAPI()
					.info(new Info().title(_swagger.getOpenApiTitle()).description(_swagger.getOpenApiDescription()).version(_swagger.getOpenApiVersion())
					.license(new License().name(_swagger.getOpenApiEnginnerName()).url(_swagger.getOpenApiEnginnerEmail())))
					.externalDocs(new ExternalDocumentation().description(_swagger.getOpenApiEnginnerEmail()).url(_swagger.getOpenApiEnginnerEmail()));
	}

	@Bean
	GroupedOpenApi groupedOpenApi() {
		return GroupedOpenApi.builder().group(_swagger.getApiGroup()).pathsToMatch(_swagger.getPathsToMatch()).build();
	}
}