package com.udpp.app.domain.type;

/// The Database engineer const.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public enum DatabaseEngineer {
    UNDEFINED("Undefined", false),
    HIBERNATE("Hibernate", true);

    private final String data;
    private final boolean implemented;

    DatabaseEngineer(String data, boolean implemented) {
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