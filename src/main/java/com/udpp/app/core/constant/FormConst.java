package com.udpp.app.core.constant;

/// The Form const.
/// @since 1.0
/// @author Claudiomildo Ventura.
public enum FormConst {
    UNDEFINED("Undefined",false),
    ANGULAR("Angular", true),
    DELPHIMDI("Delphi Mdi", false);

    private final String data;
    private final boolean implemented;

    FormConst(String data, boolean implemented) {
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