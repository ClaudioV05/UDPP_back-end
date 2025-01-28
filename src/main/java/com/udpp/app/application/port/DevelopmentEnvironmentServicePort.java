package com.udpp.app.application.port;

import com.udpp.app.core.domain.DevelopmentEnvironment;

import java.util.List;

/// The Development environment service.
/// @since 1.0
/// @author Claudiomildo Ventura.
public interface DevelopmentEnvironmentServicePort {
    /// To get enum development environment description.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @return List of Development environment.
    List<DevelopmentEnvironment> getDevelopmentEnvironmentDescription();
}