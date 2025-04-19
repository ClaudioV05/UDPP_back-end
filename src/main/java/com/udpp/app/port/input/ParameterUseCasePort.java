package com.udpp.app.port.input;

/// The Parameter use case.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public interface ParameterUseCasePort {
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