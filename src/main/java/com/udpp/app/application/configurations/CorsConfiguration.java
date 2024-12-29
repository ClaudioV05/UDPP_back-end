package com.udpp.app.application.configurations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/** Cors configuration. */
@Configuration
@PropertySources({ @PropertySource(value = "classpath:cors.yml", factory = YmlConfiguration.class) })
public class CorsConfiguration {

	@Value("${cors.urls}")
	private String[] _urls;
	
	@Value("${cors.mapping}")
	private String _mapping;

	@Bean
	WebMvcConfigurer enabledCorsConfiguration() {
		
		return new WebMvcConfigurer() {
			
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				
				if (_urls.length > -1) {
					for (int i = 0; i < _urls.length; i++) {
						registry.addMapping(_mapping).allowedOrigins(_urls[i]);
					}
				}
			}
		};
	}
}