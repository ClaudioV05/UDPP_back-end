package com.udpp.app.application.port;

/// The Parameter service.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public interface ParameterServicePort {
    /// To get the application title.
    ///
    /// @return Metadata.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    String getTitle();

    /// To get the application description.
    ///
    /// @return Metadata.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    String getDescription();
}