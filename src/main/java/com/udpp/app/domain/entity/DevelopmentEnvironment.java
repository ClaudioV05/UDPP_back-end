package com.udpp.app.domain.entity;

/// The Development Environment.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public class DevelopmentEnvironment {
    private int id;
    private String data;

    public DevelopmentEnvironment(int id, String data) {
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