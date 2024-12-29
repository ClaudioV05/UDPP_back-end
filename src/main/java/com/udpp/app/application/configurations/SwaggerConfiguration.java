package com.udpp.app.application.configurations;

import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

import com.udpp.app.infrastructure.domain.Swagger;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.License;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.ExternalDocumentation;

@Component
@EnableConfigurationProperties
@PropertySources({ @PropertySource(value = "classpath:swagger.yml", factory = YmlConfiguration.class) })
/** Swagger configuration. */
public class SwaggerConfiguration {

	private final Swagger _swagger;
	public static final String PATCHS_TO_MATCH = "/udpp/**";
	public static final String API_GROUP = "api-v1";

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
		return GroupedOpenApi.builder().group(API_GROUP).pathsToMatch(PATCHS_TO_MATCH).build();
	}

}
