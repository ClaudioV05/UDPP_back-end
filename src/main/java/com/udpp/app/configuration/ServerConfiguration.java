package com.udpp.app.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/// Server.
/// @since 1.0
/// @author Claudiomildo Ventura.
@Configuration
@PropertySources({ @PropertySource(value = "classpath:server.yml", factory = YamlConfiguration.class) })
public class ServerConfiguration implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {

	@Value("${server.port}")
	private int _port;
	
	@Override
    public void customize(ConfigurableWebServerFactory factory) {
        factory.setPort(_port);
    }
}