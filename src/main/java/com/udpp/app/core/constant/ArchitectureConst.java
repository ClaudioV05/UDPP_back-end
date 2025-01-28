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

    private final String data;

    ArchitectureConst(String data) {
        this.data = data;
    }

    public String getData() {
        return data;
    }
}