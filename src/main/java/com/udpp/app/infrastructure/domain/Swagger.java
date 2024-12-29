package com.udpp.app.infrastructure.domain;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

import com.udpp.app.application.configurations.YmlConfiguration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.PropertySource;

@Component
@EnableConfigurationProperties
@PropertySources({ @PropertySource(value = "classpath:swagger.yml", factory = YmlConfiguration.class) })
/** Swagger */
public class Swagger {
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

	public String getOpenApiTitle() {
		return openApiTitle;
	}

	public String getOpenApiDescription() {
		return openApiDescription;
	}

	public String getOpenApiVersion() {
		return openApiVersion;
	}

	public String getOpenApiTermsOfServiceUrl() {
		return openApiTermsOfServiceUrl;
	}

	public String getOpenApiProduces() {
		return openApiProduces;
	}

	public String getOpenApiLicenseUrl() {
		return openApiLicenseUrl;
	}

	public String getOpenApiEnginnerName() {
		return openApiEnginnerName;
	}

	public String getOpenApiEnginnerEmail() {
		return openApiEnginnerEmail;
	}

	public String getOpenApiEnginnerLinkedin() {
		return openApiEnginnerLinkedin;
	}
}
