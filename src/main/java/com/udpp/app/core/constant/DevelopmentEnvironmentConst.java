package com.udpp.app.core.constant;

/// The Development environment const.
/// @since 1.0
/// @author Claudiomildo Ventura.
public enum DevelopmentEnvironmentConst {
    UNDEFINED("Undefined"),
    INTELlIJ("Intellij"),
    VISUALSTUDIO("Visual Studio"),
    DELPHIXE10("Delphi XE10");

    private final String description;

    DevelopmentEnvironmentConst(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}