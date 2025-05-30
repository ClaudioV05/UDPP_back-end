package com.udpp.app.domain.type;

/// The Database const.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public enum Database {
    UNDEFINED("Undefined", false),
    SQLSERVER("SQL Server", false),
    MYSQL("My SQL", true),
    FIREBIRD("Firebird", false),
    SYBASE("Sybase", false);

    private final String data;
    private final boolean implemented;

    Database(String data, boolean implemented) {
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