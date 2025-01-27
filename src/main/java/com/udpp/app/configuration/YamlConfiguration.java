package com.udpp.app.configuration;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.springframework.beans.factory.config.YamlPropertiesFactoryBean;
import org.springframework.core.env.PropertiesPropertySource;
import org.springframework.core.io.support.EncodedResource;
import org.springframework.core.io.support.PropertySourceFactory;
import org.springframework.core.env.PropertySource;
import org.springframework.lang.Nullable;

/// Yaml.
/// @since 1.0
/// @author Claudiomildo Ventura.
public class YamlConfiguration implements PropertySourceFactory {

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