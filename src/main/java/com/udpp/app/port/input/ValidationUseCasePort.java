package com.udpp.app.port.input;

import org.springframework.validation.BindingResult;

import java.util.List;

/// The Validation use case.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public interface ValidationUseCasePort {
    /// To get error messages.
    ///
    /// @param bindingResult binding result.
    /// @return List of String.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    List<String> getErrorMessages(BindingResult bindingResult);
}