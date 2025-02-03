package com.udpp.app.application.port;

import com.udpp.app.core.domain.DatabaseEngineer;

import java.util.LinkedHashSet;

/// The database engineer service.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public interface DatabaseEngineerServicePort {
    /// To get enum database engineer data.
    ///
    /// @return Set of Database engineer.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    LinkedHashSet<DatabaseEngineer> getData();
}