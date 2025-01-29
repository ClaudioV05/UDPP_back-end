package com.udpp.app.application.port;

/// The Unicode service.
/// @since 1.0
/// @author Claudiomildo Ventura.
public interface UnicodeServicePort {
    /// Set the content to upper case.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @param content content.
    /// @return String.
    String setToUpper(String content);
    /// Set the content to lower case.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @param content content.
    /// @return String.
    String setToLower(String content);
    /// Set the string as empty.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @return String.
    String setStringEmpty();
}