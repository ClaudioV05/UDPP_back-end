package com.service.unified_development_power_platform.Application.Configurations;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.service.unified_development_power_platform.Presentation.Api.Interceptor.RequestInterceptorUnifiedDevelopmentPowerPlatform;

/**
 * Request interceptor configuration.
 *
 * <p>
 * --
 * </p>
 *
 * <pre>
 *  --
 * </pre>
 *
 * @param --
 * @return --
 * @throws --
 * @see --
 * @since 2.2.2
 * @author Claudiomildo Ventura
 */
@Configuration
class RequestInterceptorConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new RequestInterceptorUnifiedDevelopmentPowerPlatform());
	}
}