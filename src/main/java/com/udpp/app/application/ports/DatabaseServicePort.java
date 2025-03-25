package com.udpp.app.application.ports;

import com.udpp.app.application.core.domain.Database;

import java.util.LinkedHashSet;

/// The Database service.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public interface DatabaseServicePort {
    /// To get enum database data.
    ///
    /// @return Set of Database.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    LinkedHashSet<Database> getData();
}