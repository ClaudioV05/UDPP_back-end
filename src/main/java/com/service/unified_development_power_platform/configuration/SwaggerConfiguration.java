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
public class SwaggerConfiguration {

    @Value("${unifieddevelopmentpowerplatform.name}")
    private String unifiedDevelopmentPowerPlatformApplication;

    private Contact contact() {
        return new Contact("Claudiomildo Ventura","https://www.linkedin.com/in/claudiomildoventura/","claudiomildo@hotmail.com");
    }

    private ApiInfoBuilder apiInformation() {
        final String openApiTitle = unifiedDevelopmentPowerPlatformApplication + " Controller";
        final String openApiDescription = "About\n" + "These API service is the evolution the of old project that generated class that was developed in Object Pascal using the Delphi XE10. The architecture pattern used is Domain-Driven Design(DDD).";
        final String openApiVersion = "1.0";
        final String openApiTermsOfServiceUrl = "-";
        final String openApiLicense = "application/json";
        final String openApiLicenseUrl = "https://www.linkedin.com/in/claudiomildoventura/";

        ApiInfoBuilder apiInfoBuilder = new ApiInfoBuilder();

        apiInfoBuilder.title(openApiTitle);
        apiInfoBuilder.description(openApiDescription);
        apiInfoBuilder.version(openApiVersion);
        apiInfoBuilder.termsOfServiceUrl(openApiTermsOfServiceUrl);
        apiInfoBuilder.license(openApiLicense);
        apiInfoBuilder.licenseUrl(openApiLicenseUrl);
        apiInfoBuilder.contact(this.contact());

        return apiInfoBuilder;
    }

    @Bean
    public Docket apiDetail() {
        String controllerPackageName = "com.service.unified_development_power_platform.api.controllers";
        String produces = "application/json";

        Docket docket = new Docket(DocumentationType.SWAGGER_2);

        docket.select()
                .apis(RequestHandlerSelectors.basePackage(controllerPackageName))
                .paths(PathSelectors.any())
                .build()
                .apiInfo(this.apiInformation().build())
                .consumes(new HashSet<String>(Arrays.asList(produces)))
                .produces(new HashSet<String>(Arrays.asList(produces)));

        return docket;
    }
}