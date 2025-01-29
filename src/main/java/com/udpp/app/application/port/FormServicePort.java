package com.udpp.app.application.port;

import com.udpp.app.core.domain.Form;

import java.util.LinkedHashSet;

/// The Form service.
/// @since 1.0
/// @author Claudiomildo Ventura.
public interface FormServicePort {
    /// To get enum form data.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @return Set of Form.
    LinkedHashSet<Form> getData();
}