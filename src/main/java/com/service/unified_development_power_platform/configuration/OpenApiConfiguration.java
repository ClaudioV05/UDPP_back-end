package com.service.unified_development_power_platform.configuration;

import java.util.Arrays;
import java.util.HashSet;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

/**
 * Swagger configuration.
 */
@EnableWebMvc
@Configuration
public class OpenApiConfiguration {

    @Value("${openapi_title}")
    private String openApiTitle;

    @Value("${openapi_description}")
    private String openApiDescription;

    @Value("${openapi_version}")
    private String openApiVersion;

    @Value("${openapi_terms_of_serviceUrl}")
    private String openApiTermsOfServiceUrl;

    @Value("${openapi_produces}")
    private String openApiProduces;

    @Value("${openapi_license_url}")
    private String openApiLicenseUrl;

    @Value("${openapi_name}")
    private String openApiEnginnerName;

    @Value("${openapi_email}")
    private String openApiEnginnerEmail;

    @Value("${openapi_linkedin}")
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

        String controllerPackageName = "com.service.unified_development_power_platform.api.controllers";

        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        docket.select()
                .apis(RequestHandlerSelectors.basePackage(controllerPackageName))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.apiInformation().build())
                .consumes(new HashSet<String>(Arrays.asList(openApiProduces)))
                .produces(new HashSet<String>(Arrays.asList(openApiProduces)));

        return docket;
    }
}