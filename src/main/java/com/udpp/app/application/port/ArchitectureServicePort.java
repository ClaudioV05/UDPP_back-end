package com.udpp.app.application.port;

import com.udpp.app.core.constant.Architecture;

import java.util.List;

/// The Architecture service.
/// @since 1.0
/// @author Claudiomildo Ventura.
public interface ArchitectureServicePort {
    /// To get enum architectures description.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @return List of Architecture.
    List<Architecture> getArchitecturesDescription();
}