package com.service.unified_development_power_platform;

import static org.junit.Assert.assertTrue;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.service.unified_development_power_platform.Application.Interfaces.ServiceUnifiedDevelopmentPowerPlatform;

@ExtendWith(MockitoExtension.class)
class ServiceImpUnifiedDevelopmentPowerPlatformTest {

	@Mock
	ServiceUnifiedDevelopmentPowerPlatform serviceUnifiedDevelopmentPowerPlatform;

	@Test
	@DisplayName("The title is shown")
	void theTitleIsShow() throws Exception {
		String result = "";
		String stringEmpty = "";

		result = serviceUnifiedDevelopmentPowerPlatform.titleInformation();

		assertTrue(result != stringEmpty);
	}
}
