package com.udpp.app.core.constant;

/// The Database const.
/// @since 1.0
/// @author Claudiomildo Ventura.
public enum DatabaseConst {
    UNDEFINED("Undefined"),
    SQLSERVER("SQL Server"),
    MYSQL("My SQL"),
    FIREBIRD("Firebird"),
    SYBASE("Sybase");

    /// description.
    private final String description;

    DatabaseConst(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}