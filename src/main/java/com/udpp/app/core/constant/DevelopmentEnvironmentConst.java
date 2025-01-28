package com.udpp.app.core.constant;

/// The Development environment const.
/// @since 1.0
/// @author Claudiomildo Ventura.
public enum DevelopmentEnvironmentConst {
    UNDEFINED("Undefined"),
    INTELlIJ("Intellij"),
    VISUALSTUDIO("Visual Studio"),
    DELPHIXE10("Delphi XE10");

    private final String data;

    DevelopmentEnvironmentConst(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}