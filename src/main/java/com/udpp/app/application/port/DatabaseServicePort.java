package com.udpp.app.application.port;

import com.udpp.app.core.domain.Database;

import java.util.List;

/// The Database service.
/// @since 1.0
/// @author Claudiomildo Ventura.
public interface DatabaseServicePort {
    /// To get enum database description.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @return List of Database.
    List<Database> getDatabasesDescription();
}