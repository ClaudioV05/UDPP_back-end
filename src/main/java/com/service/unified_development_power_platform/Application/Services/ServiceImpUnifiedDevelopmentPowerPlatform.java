package com.service.unified_development_power_platform.Application.Services;

import org.springframework.stereotype.Service;

import com.service.unified_development_power_platform.Application.Interfaces.ServiceUnifiedDevelopmentPowerPlatform;

/** The Service Implementation Unified Development Power Platform. */
@Service
public class ServiceImpUnifiedDevelopmentPowerPlatform implements ServiceUnifiedDevelopmentPowerPlatform {

	@Override
	public String titleInformation() {
		return "The unified development power platform.";
	}

}