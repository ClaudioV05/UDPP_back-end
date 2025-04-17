package com.udpp.app.domain.type;

/// The Development environment const.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public enum DevelopmentEnvironment {
    UNDEFINED("Undefined", false),
    INTELlIJ("Intellij", true),
    VISUALSTUDIO("Visual Studio", false),
    DELPHIXE10("Delphi XE10", false);

    private final String data;
    private final boolean implemented;

    DevelopmentEnvironment(String data, boolean implemented) {
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