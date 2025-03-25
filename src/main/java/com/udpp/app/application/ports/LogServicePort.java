package com.udpp.app.application.ports;

/// The Log service.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public interface LogServicePort {
    /// The register log.
    ///
    /// @param message message.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    void registerLog(String message);
}