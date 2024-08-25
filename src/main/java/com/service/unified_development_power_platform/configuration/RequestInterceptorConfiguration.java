package com.service.unified_development_power_platform.configuration;

import com.service.unified_development_power_platform.api.Interceptor.RequestInterceptorUnifiedDevelopmentPowerPlatform;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Request interceptor configuration.
 *
 * <p>Description of the method with optional {@code code} and {@link Object links to Javadoc} </p>
 *
 * <pre> -- </pre>
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
    public void addInterceptors(InterceptorRegistry registry)
    {
        registry.addInterceptor(new RequestInterceptorUnifiedDevelopmentPowerPlatform());
    }
    //* We can register any number of interceptors with our spring application context
}