package com.udpp.app.port.input;

import com.udpp.app.domain.entity.Database;

import java.util.LinkedHashSet;

/// The Database use case.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public interface DatabaseUseCasePort {
    /// To get enum database data.
    ///
    /// @return Set of Database.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    LinkedHashSet<Database> getData();
}