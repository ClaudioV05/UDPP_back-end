package com.udpp.app.core.constant;

/// The Database engineer const.
/// @since 1.0
/// @author Claudiomildo Ventura.
public enum DatabaseEngineerConst {
    UNDEFINED("Undefined"),
    HIBERNATE("Hibernate");

    /// description.
    private final String description;

    DatabaseEngineerConst(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}