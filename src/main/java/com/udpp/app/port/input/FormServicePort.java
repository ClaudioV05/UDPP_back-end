package com.udpp.app.port.input;

import com.udpp.app.domain.entity.Form;

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