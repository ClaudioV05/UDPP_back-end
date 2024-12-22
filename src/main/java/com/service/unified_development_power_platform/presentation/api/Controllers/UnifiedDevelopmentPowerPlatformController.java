package com.service.unified_development_power_platform.presentation.api.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * The unified development power platform controller.
 */
@RestController
public class UnifiedDevelopmentPowerPlatformController {

    @GetMapping()
    public String welcome() {
        return "The unified development power platform.";
    }
}