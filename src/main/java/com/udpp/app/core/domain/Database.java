package com.udpp.app.core.domain;

/// The Database.
/// @since 1.0
/// @author Claudiomildo Ventura.
public class Database {
    private long id;
    private String data;

    public Database(long id, String data) {
        this.id = id;
        this.data = data;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }
}