package com.udpp.app.port.input;

import com.udpp.app.domain.entity.DatabaseEngineer;

import java.util.LinkedHashSet;

/// The database engineer use case.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public interface DatabaseEngineerUseCasePort {
    /// To get enum database engineer data.
    ///
    /// @return Set of Database engineer.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    LinkedHashSet<DatabaseEngineer> getData();
}