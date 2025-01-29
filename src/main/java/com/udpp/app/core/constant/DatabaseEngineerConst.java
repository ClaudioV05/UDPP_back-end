package com.udpp.app.core.constant;

/// The Database engineer const.
/// @since 1.0
/// @author Claudiomildo Ventura.
public enum DatabaseEngineerConst {
    UNDEFINED("Undefined", false),
    HIBERNATE("Hibernate", true);

    private final String data;
    private final boolean implemented;

    DatabaseEngineerConst(String data, boolean implemented) {
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