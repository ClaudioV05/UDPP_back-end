package com.udpp.app.application.port;

import com.udpp.app.core.domain.Form;

import java.util.LinkedHashSet;

/// The Form service.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public interface FormServicePort {
    /// To get enum form data.
    ///
    /// @return Set of Form.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    LinkedHashSet<Form> getData();
}