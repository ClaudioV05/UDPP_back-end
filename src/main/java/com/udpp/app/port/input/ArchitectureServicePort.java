package com.udpp.app.port.input;

import com.udpp.app.domain.entity.Architecture;

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