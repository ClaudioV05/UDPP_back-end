package com.udpp.app.application.core.constant;

/// The Development environment const.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public enum DevelopmentEnvironmentConst {
    UNDEFINED("Undefined", false),
    INTELlIJ("Intellij", true),
    VISUALSTUDIO("Visual Studio", false),
    DELPHIXE10("Delphi XE10", false);

    private final String data;
    private final boolean implemented;

    DevelopmentEnvironmentConst(String data, boolean implemented) {
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