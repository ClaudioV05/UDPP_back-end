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

    /// description.
    private final String description;

    ArchitectureConst(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}