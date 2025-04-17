package com.udpp.app.domain.type;

/// The Architecture const.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public enum Architecture {
    UNDEFINED("Undefined", false),
    DDD("Domain Driven Design", false),
    HEXAGONAL("Hexagonal", true),
    MEDIATR("MediatR", false),
    MVC("Model view controller", false);

    private final String data;
    private final boolean implemented;

    Architecture(String data, boolean implemented) {
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