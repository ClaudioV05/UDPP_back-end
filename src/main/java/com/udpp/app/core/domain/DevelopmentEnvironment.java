package com.udpp.app.core.domain;

/// The Development Environment.
/// @since 1.0
/// @author Claudiomildo Ventura.
public class DevelopmentEnvironment {
    private int id;
    private String name;

    public DevelopmentEnvironment(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
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