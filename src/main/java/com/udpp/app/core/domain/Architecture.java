package com.udpp.app.core.domain;

/// The Architecture.
/// @since 1.0
/// @author Claudiomildo Ventura.
public class Architecture {
    private int id;
    private String name;

    public Architecture(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}