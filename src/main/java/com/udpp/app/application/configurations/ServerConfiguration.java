package com.udpp.app.application.configurations;

import org.springframework.boot.web.server.ConfigurableWebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.stereotype.Component;

@Component
public class ServerConfiguration implements WebServerFactoryCustomizer<ConfigurableWebServerFactory> {

	@Override
    public void customize(ConfigurableWebServerFactory factory) {
        factory.setPort(3000);
    }
}