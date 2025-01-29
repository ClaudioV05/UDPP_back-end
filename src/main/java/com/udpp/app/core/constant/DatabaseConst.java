package com.udpp.app.core.constant;

/// The Database const.
/// @since 1.0
/// @author Claudiomildo Ventura.
public enum DatabaseConst {
    UNDEFINED("Undefined",false),
    SQLSERVER("SQL Server",false),
    MYSQL("My SQL", true),
    FIREBIRD("Firebird",false),
    SYBASE("Sybase", false);

    private final String data;
    private final boolean implemented;

    DatabaseConst(String data, boolean implemented) {
        this.data = data;
        this.implemented = implemented;
    }

    public String getData() {
        return data;
    }

    public boolean getImplemented() {
        return implemented;
    }
}