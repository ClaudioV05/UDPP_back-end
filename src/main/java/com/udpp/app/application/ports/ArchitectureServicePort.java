package com.udpp.app.application.ports;

import com.udpp.app.application.core.domain.Architecture;

import java.util.LinkedHashSet;

/// The Architecture service.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public interface ArchitectureServicePort {
    /// To get enum architectures data.
    ///
    /// @return Set of Architecture.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    LinkedHashSet<Architecture> getData();
}