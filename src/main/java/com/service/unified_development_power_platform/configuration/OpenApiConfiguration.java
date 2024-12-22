package com.service.unified_development_power_platform.configuration;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/** Swagger configuration. */
@Configuration
@EnableConfigurationProperties
@PropertySources({ @PropertySource(value = "classpath:swagger.yml", factory = YamlConfigPropertySourceFactory.class),
		@PropertySource(value = "classpath:udpp.yml", factory = YamlConfigPropertySourceFactory.class) })
public class OpenApiConfiguration {

	@Value("${swagger_openapi.title:#{null}}")
	private String openApiTitle;

	@Value("${swagger_openapi.description}")
	private String openApiDescription;

	@Value("${swagger_openapi.version}")
	private String openApiVersion;

	@Value("${swagger_openapi.terms_of_serviceUrl}")
	private String openApiTermsOfServiceUrl;

	@Value("${swagger_openapi.produces}")
	private String openApiProduces;

	@Value("${swagger_openapi.license_url}")
	private String openApiLicenseUrl;

	@Value("${swagger_openapi_personal_information.name}")
	private String openApiEnginnerName;

	@Value("${swagger_openapi_personal_information.email}")
	private String openApiEnginnerEmail;

	@Value("${swagger_openapi_personal_information.linkedin}")
	private String openApiEnginnerLinkedin;

	private Contact returnContactInformation() {
		return new Contact(openApiEnginnerName, openApiEnginnerLinkedin, openApiEnginnerLinkedin);
	}

	private ApiInfoBuilder apiInformation() {
		ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

		apiInfoBuilder.title(openApiTitle);
		apiInfoBuilder.description(openApiDescription);
		apiInfoBuilder.version(openApiVersion);
		apiInfoBuilder.termsOfServiceUrl(openApiTermsOfServiceUrl);
		apiInfoBuilder.license(openApiProduces);
		apiInfoBuilder.licenseUrl(openApiLicenseUrl);
		apiInfoBuilder.contact(this.returnContactInformation());

		return apiInfoBuilder;
	}

	@Bean
	public Docket apiDetail() {

		String controllerPackageName = "com.service.unified_development_power_platform.presentation.api.Controllers";

		Docket docket = new Docket(DocumentationType.SWAGGER_2);

		docket.select().apis(RequestHandlerSelectors.basePackage(controllerPackageName)).paths(PathSelectors.any())
				.build().apiInfo(this.apiInformation().build())
				.consumes(new HashSet<String>(Arrays.asList(openApiProduces)))
				.produces(new HashSet<String>(Arrays.asList(openApiProduces)));

		return docket;
	}
}