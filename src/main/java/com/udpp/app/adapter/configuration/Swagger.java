package com.udpp.app.adapter.configuration;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.annotation.PropertySource;

/**
 * The swagger Entity.
 *
 * @since 1.0
 * @author Claudiomildo Ventura.
 * @see
 */
@Component
@PropertySources({ @PropertySource(value = "classpath:openapi_doc.yml", factory = YmlConfiguration.class) })

public class Swagger {
	@Value("${openapi_doc.title:#{null}}")
	private String openApiTitle;

	@Value("${openapi_doc.description:#{null}}")
	private String openApiDescription;

	@Value("${openapi_doc.version:#{null}}")
	private String openApiVersion;

	@Value("${openapi_doc.terms_of_serviceUrl:#{null}}")
	private String openApiTermsOfServiceUrl;

	@Value("${openapi_doc.produces:#{null}}")
	private String openApiProduces;

	@Value("${openapi_doc.license_url:#{null}}")
	private String openApiLicenseUrl;

	@Value("${openapi_doc_personal_information.name:#{null}}")
	private String openApiEnginnerName;

	@Value("${openapi_doc_personal_information.email:#{null}}")
	private String openApiEnginnerEmail;

	@Value("${openapi_doc_personal_information.linkedin:#{null}}")
	private String openApiEnginnerLinkedin;
	
	@Value("${openapi_doc_conf.apigroup}")
	private String apiGroup;
	
	@Value("${openapi_doc_conf.paths}")
	private String[] pathsToMatch;

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
	
	public String getApiGroup() {
		return apiGroup;
	}
	
	public String[] getPathsToMatch() {
		return pathsToMatch;
	}
}
