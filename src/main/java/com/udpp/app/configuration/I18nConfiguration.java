package com.udpp.app.configuration;

import java.util.Locale;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

/// Internationalization (i18n).
/// @since 1.0
/// @author Claudiomildo Ventura.
@Configuration
public class I18nConfiguration {
	@Bean
	SessionLocaleResolver localeResolver() {

		SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
		sessionLocaleResolver.setDefaultLocale(Locale.ENGLISH);
		return sessionLocaleResolver;
	}
}