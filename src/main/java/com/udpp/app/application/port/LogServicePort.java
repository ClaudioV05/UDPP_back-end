package com.udpp.app.application.port;

/// The Log service.
/// @since 1.0
/// @author Claudiomildo Ventura.
public interface LogServicePort {
    /// The register log.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @param message message.
    void registerLog(String message);
}