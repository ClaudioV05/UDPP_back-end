package com.udpp.app.application.port;

import com.udpp.app.core.domain.Architecture;

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