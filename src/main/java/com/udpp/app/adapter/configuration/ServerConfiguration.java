package com.udpp.app.adapter.configuration;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

/** Server configuration. */
@Configuration
@PropertySources({ @PropertySource(value = "classpath:server.yml", factory = YmlConfiguration.class) })
public class ServerConfiguration implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {

	@Value("${server.port}")
	private int _port;
	
	@Override
    public void customize(ConfigurableWebServerFactory factory) {
        factory.setPort(_port);
    }
}