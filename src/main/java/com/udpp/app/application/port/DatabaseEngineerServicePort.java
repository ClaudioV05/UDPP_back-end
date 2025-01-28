package com.udpp.app.application.port;

import com.udpp.app.core.domain.DatabaseEngineer;

import java.util.List;

/// The database engineer service.
/// @since 1.0
/// @author Claudiomildo Ventura.
public interface DatabaseEngineerServicePort {
    /// To get enum database engineer description.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @return List of Database engineer.
    List<DatabaseEngineer> getDatabasesEngineerDescription();
}