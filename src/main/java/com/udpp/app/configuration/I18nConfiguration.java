package com.udpp.app.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

import java.util.Locale;

/// Internationalization (i18n).
///
/// @author Claudiomildo Ventura.
/// @since 1.0
@Configuration
public class I18nConfiguration {
    @Bean
    SessionLocaleResolver localeResolver() {

        SessionLocaleResolver sessionLocaleResolver = new SessionLocaleResolver();
        sessionLocaleResolver.setDefaultLocale(Locale.ENGLISH);
        return sessionLocaleResolver;
    }
}