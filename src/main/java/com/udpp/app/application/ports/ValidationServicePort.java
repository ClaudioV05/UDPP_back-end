package com.udpp.app.application.ports;

import org.springframework.validation.BindingResult;

import java.util.List;

/// The Validation service.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public interface ValidationServicePort {
    /// To get error messages.
    ///
    /// @param bindingResult binding result.
    /// @return List of String.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    List<String> getErrorMessages(BindingResult bindingResult);
}