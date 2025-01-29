package com.udpp.app.application.port;

import com.udpp.app.core.domain.DevelopmentEnvironment;

import java.util.LinkedHashSet;

/// The Development environment service.
/// @since 1.0
/// @author Claudiomildo Ventura.
public interface DevelopmentEnvironmentServicePort {
    /// To get enum development environment data.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @return Set of Development environment.
    LinkedHashSet<DevelopmentEnvironment> getData();
}