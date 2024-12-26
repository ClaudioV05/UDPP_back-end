package com.service.unified_development_power_platform;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.service.unified_development_power_platform.Application.Services.ServiceImpUnifiedDevelopmentPowerPlatform;

@SpringBootTest
class ServiceImpUnifiedDevelopmentPowerPlatformTest {

	@Test
	@DisplayName("The title is shown")
	void theTitleIsShow() {
		String result = "";
		String stringEmpty = "";
		ServiceImpUnifiedDevelopmentPowerPlatform serviceImpUnifiedDevelopmentPowerPlatform = new ServiceImpUnifiedDevelopmentPowerPlatform();

		result = serviceImpUnifiedDevelopmentPowerPlatform.titleInformation();

		assertTrue(result != stringEmpty);
	}
}
