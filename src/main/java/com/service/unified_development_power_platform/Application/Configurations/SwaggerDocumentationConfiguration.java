package com.service.unified_development_power_platform.Application.Configurations;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RestController;

import com.service.unified_development_power_platform.Infraestructure.Domain.Swagger;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/** Swagger configuration. */
@Configuration
public class SwaggerDocumentationConfiguration {

	private final Swagger _swagger;

	@Autowired
	SwaggerDocumentationConfiguration(Swagger swagger) {
		_swagger = swagger;
	}

	@Bean
	Docket apiDetail() {

		Docket docket = new Docket(DocumentationType.SWAGGER_2);

		docket.select().apis(RequestHandlerSelectors.withClassAnnotation(RestController.class))
				.paths(PathSelectors.any()).build().apiInfo(this.apiInformation().build())
				.consumes(new HashSet<String>(Arrays.asList(_swagger.getOpenApiProduces())))
				.produces(new HashSet<String>(Arrays.asList(_swagger.getOpenApiProduces())));

		return docket;
	}

	private Contact returnContactInformation() {
		return new Contact(_swagger.getOpenApiEnginnerName(), _swagger.getOpenApiEnginnerLinkedin(),
				_swagger.getOpenApiEnginnerLinkedin());
	}

	private ApiInfoBuilder apiInformation() {
		ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

		apiInfoBuilder.title(_swagger.getOpenApiTitle());
		apiInfoBuilder.description(_swagger.getOpenApiDescription());
		apiInfoBuilder.version(_swagger.getOpenApiVersion());
		apiInfoBuilder.termsOfServiceUrl(_swagger.getOpenApiTermsOfServiceUrl());
		apiInfoBuilder.license(_swagger.getOpenApiProduces());
		apiInfoBuilder.licenseUrl(_swagger.getOpenApiLicenseUrl());
		apiInfoBuilder.contact(this.returnContactInformation());

		return apiInfoBuilder;
	}
}