package com.udpp.app.config;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.env.PropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;
import org.springframework.lang.Nullable;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/// Yaml.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public class YamlConfig implements PropertySourceFactory {

    @Override
    public PropertySource<?> createPropertySource(@Nullable String name,
                                                  EncodedResource resource) throws IOException {
        Properties propertiesFromYaml = this.loadYamlIntoProperties(resource);
        String sourceName = name != null ? name : resource.getResource().getFilename();
        return new PropertiesPropertySource(sourceName, propertiesFromYaml);
    }

    private Properties loadYamlIntoProperties(EncodedResource resource) throws FileNotFoundException {
        try {
            YamlPropertiesFactoryBean factory = new YamlPropertiesFactoryBean();
            factory.setResources(resource.getResource());
            factory.afterPropertiesSet();
            return factory.getObject();
        } catch (IllegalStateException ex) {
            Throwable cause = ex.getCause();
            if (cause instanceof FileNotFoundException)
                throw (FileNotFoundException) ex.getCause();
            throw ex;
        }
    }
}