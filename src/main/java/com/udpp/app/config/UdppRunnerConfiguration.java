package com.udpp.app.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Component;

/// Unified Development Power Platform runner.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
@Component
@PropertySources({@PropertySource(value = "classpath:udpp.yml", factory = YamlConfiguration.class)})
public class UdppRunnerConfiguration implements ApplicationRunner {

    @Value("${application.title:#{null}}")
    private String _title;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(_title + " Start.");
    }
}