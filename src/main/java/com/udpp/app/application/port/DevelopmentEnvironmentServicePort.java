package com.udpp.app.application.port;

import com.udpp.app.core.domain.DevelopmentEnvironment;

import java.util.LinkedHashSet;

/// The Development environment service.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public interface DevelopmentEnvironmentServicePort {
    /// To get enum development environment data.
    ///
    /// @return Set of Development environment.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    LinkedHashSet<DevelopmentEnvironment> getData();
}