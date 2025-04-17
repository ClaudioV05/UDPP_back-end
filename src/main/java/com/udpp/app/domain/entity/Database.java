package com.udpp.app.domain.entity;

/// The Database.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
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