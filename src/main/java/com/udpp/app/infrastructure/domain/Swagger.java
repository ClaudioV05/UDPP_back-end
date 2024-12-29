package com.udpp.app.infrastructure.domain;

import org.springframework.beans.factory.annotation.Value;

import org.springframework.stereotype.Component;

import com.udpp.app.application.configurations.YmlConfiguration;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.PropertySource;

@Component
@EnableConfigurationProperties
@PropertySources({ @PropertySource(value = "classpath:openapi_doc.yml", factory = YmlConfiguration.class) })
/** Swagger */
public class Swagger {
	@Value("${openapi_doc.title:#{null}}")
	private String openApiTitle;

	@Value("${openapi_doc.description}")
	private String openApiDescription;

	@Value("${openapi_doc.version}")
	private String openApiVersion;

	@Value("${openapi_doc.terms_of_serviceUrl}")
	private String openApiTermsOfServiceUrl;

	@Value("${openapi_doc.produces}")
	private String openApiProduces;

	@Value("${openapi_doc.license_url}")
	private String openApiLicenseUrl;

	@Value("${openapi_doc_personal_information.name}")
	private String openApiEnginnerName;

	@Value("${openapi_doc_personal_information.email}")
	private String openApiEnginnerEmail;

	@Value("${openapi_doc_personal_information.linkedin}")
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
