package com.udpp.app.application.port;

import com.udpp.app.core.domain.DatabaseEngineer;

import java.util.LinkedHashSet;

/// The database engineer service.
/// @since 1.0
/// @author Claudiomildo Ventura.
public interface DatabaseEngineerServicePort {
    /// To get enum database engineer data.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @return Set of Database engineer.
    LinkedHashSet<DatabaseEngineer> getData();
}