package com.udpp.app.application.port;

/// The Unicode service.
/// @since 1.0
/// @author Claudiomildo Ventura.
public interface UnicodeServicePort {
    /// Set the content to upper case;
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @param content content.
    /// @return String.
    String setToUpper(String content);
}