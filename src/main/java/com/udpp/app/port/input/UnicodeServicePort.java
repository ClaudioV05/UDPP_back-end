package com.udpp.app.port.input;

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

    /// Get last index of.
    ///
    /// @param content content.
    /// @param itemToFind itemToFind.
    /// @return integer.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    int getLastIndexOf(String content, String itemToFind);

    /// Set sub string.
    ///
    /// @param content content.
    /// @param startPosition startPosition.
    /// @param length length.
    /// @return integer.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    String setSubstring(String content, int startPosition, int length);
}