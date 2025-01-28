package com.udpp.app.core.domain;

/// The Database.
/// @since 1.0
/// @author Claudiomildo Ventura.
public class Database {
    private long id;
    private String name;

    public Database(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}