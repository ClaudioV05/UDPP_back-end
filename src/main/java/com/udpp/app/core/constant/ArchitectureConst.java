package com.udpp.app.core.constant;

/// The Architecture const.
/// @since 1.0
/// @author Claudiomildo Ventura.
public enum ArchitectureConst {
    UNDEFINED("Undefined"),
    DDD("Domain Driven Design"),
    HEXAGONAL("Hexagonal"),
    MEDIATR("MediatR"),
    MVC("Model view controller");

    /// key.
    private final String key;

    ArchitectureConst(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }
}