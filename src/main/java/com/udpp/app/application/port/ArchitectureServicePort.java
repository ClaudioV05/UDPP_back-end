package com.udpp.app.application.port;

import com.udpp.app.core.domain.Architecture;

import java.util.LinkedHashSet;

/// The Architecture service.
/// @since 1.0
/// @author Claudiomildo Ventura.
public interface ArchitectureServicePort {
    /// To get enum architectures description.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @return Set of Architecture.
    LinkedHashSet<Architecture> getArchitecturesDescription();
}