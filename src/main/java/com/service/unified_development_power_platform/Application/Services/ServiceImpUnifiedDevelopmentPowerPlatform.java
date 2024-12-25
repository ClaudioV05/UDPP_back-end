package com.service.unified_development_power_platform.Application.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.stereotype.Service;

import com.service.unified_development_power_platform.Application.Configurations.YamlSourceFactory;
import com.service.unified_development_power_platform.Application.Interfaces.ServiceUnifiedDevelopmentPowerPlatform;

/** The Service Implementation Unified Development Power Platform. */
@Service
@PropertySources({ @PropertySource(value = "classpath:udpp.yml", factory = YamlSourceFactory.class) })
public class ServiceImpUnifiedDevelopmentPowerPlatform implements ServiceUnifiedDevelopmentPowerPlatform {

	@Value("${application.title}")
	private String _unifiedDevelopmentPowerPlatformApplication;
	
	@Override
	public String titleInformation() {
		return _unifiedDevelopmentPowerPlatformApplication;
	}

}