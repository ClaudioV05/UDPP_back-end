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

    private final String data;

    DatabaseConst(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}