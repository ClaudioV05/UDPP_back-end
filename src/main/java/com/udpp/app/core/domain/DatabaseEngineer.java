package com.udpp.app.core.domain;

/// The Database engineer.
/// @since 1.0
/// @author Claudiomildo Ventura.
public class DatabaseEngineer {
    private int id;
    private String data;

    public DatabaseEngineer(int id, String data) {
        this.id = id;
        this.data = data;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}