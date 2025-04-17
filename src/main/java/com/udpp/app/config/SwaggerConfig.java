package com.udpp.app.config;

import io.swagger.v3.oas.models.ExternalDocumentation;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/// Swagger.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
@Configuration
@PropertySources({@PropertySource(value = "classpath:openapi_doc.yml", factory = YamlConfig.class)})
public class SwaggerConfig implements WebMvcConfigurer {

    @Value("${openapi_doc.title:#{null}}")
    private String _openApiTitle;

    @Value("${openapi_doc.description:#{null}}")
    private String _openApiDescription;

    @Value("${openapi_doc.version:#{null}}")
    private String _openApiVersion;

    @Value("${openapi_doc.terms_of_serviceUrl:#{null}}")
    private String _openApiTermsOfServiceUrl;

    @Value("${openapi_doc.produces:#{null}}")
    private String _openApiProduces;

    @Value("${openapi_doc.license_url:#{null}}")
    private String _openApiLicenseUrl;

    @Value("${openapi_doc_personal_information.name:#{null}}")
    private String _openApiEnginnerName;

    @Value("${openapi_doc_personal_information.email:#{null}}")
    private String _openApiEnginnerEmail;

    @Value("${openapi_doc_personal_information.linkedin:#{null}}")
    private String _openApiEnginnerLinkedin;

    @Value("${openapi_doc_conf.apigroup}")
    private String _apiGroup;

    @Value("${openapi_doc_conf.paths}")
    private String[] _pathsToMatch;

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/swagger-ui/")
                .setViewName("forward:" + "/swagger-ui/index.html");
    }

    @Bean
    OpenAPI openApiDetails() {
        return new OpenAPI()
                .info(new Info()
                        .title(_openApiTitle)
                        .description(_openApiDescription)
                        .version(_openApiVersion)
                        .license(new License().name(_openApiEnginnerName).url(_openApiEnginnerEmail)))
                .externalDocs(new ExternalDocumentation().description(_openApiEnginnerEmail).url(_openApiEnginnerEmail));
    }

    @Bean
    GroupedOpenApi groupedOpenApi() {
        return GroupedOpenApi.builder()
                .group(_apiGroup)
                .pathsToMatch(_pathsToMatch)
                .build();
    }
}