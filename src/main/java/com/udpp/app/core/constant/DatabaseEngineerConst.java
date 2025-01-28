package com.udpp.app.core.constant;

/// The Database engineer const.
/// @since 1.0
/// @author Claudiomildo Ventura.
public enum DatabaseEngineerConst {
    UNDEFINED("Undefined"),
    HIBERNATE("Hibernate");

    private final String data;

    DatabaseEngineerConst(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}