package com.udpp.app.application.ports;

/// The Unicode service.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public interface UnicodeServicePort {
    /// Set the content to upper case.
    ///
    /// @param content content.
    /// @return String.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    String setToUpper(String content);

    /// Set the content to lower case.
    ///
    /// @param content content.
    /// @return String.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    String setToLower(String content);

    /// Set the string as empty.
    ///
    /// @return String.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    String setStringEmpty();
}