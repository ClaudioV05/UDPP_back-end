package com.udpp.app.domain.type;

/// The Form const.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public enum Form {
    UNDEFINED("Undefined", false),
    ANGULAR("Angular", true),
    DELPHIMDI("Delphi Mdi", false);

    private final String data;
    private final boolean implemented;

    Form(String data, boolean implemented) {
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