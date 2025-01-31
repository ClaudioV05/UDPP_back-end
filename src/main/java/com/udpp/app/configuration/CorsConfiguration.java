package com.udpp.app.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/// Cross-Origin Resource Sharing (CORS).
///
/// @author Claudiomildo Ventura.
/// @since 1.0
@Configuration
@PropertySources({@PropertySource(value = "classpath:cors.yml", factory = YamlConfiguration.class)})
public class CorsConfiguration {

    @Value("${cors.base_path}")
    private String _basePath;

    @Value("${cors.allowed_origins}")
    private String[] _allowedOrigins;

    @Bean
    WebMvcConfigurer enabledCorsConfiguration() {
        return new WebMvcConfigurer() {

            @Override
            public void addCorsMappings(CorsRegistry registry) {
                registry.addMapping(_basePath).allowedOrigins(_allowedOrigins);
            }
        };
    }
}