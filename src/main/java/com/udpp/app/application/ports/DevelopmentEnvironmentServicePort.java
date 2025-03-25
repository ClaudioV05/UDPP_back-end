package com.udpp.app.application.ports;

import com.udpp.app.application.core.domain.DevelopmentEnvironment;

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