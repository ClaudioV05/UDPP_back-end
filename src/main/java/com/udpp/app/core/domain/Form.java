package com.udpp.app.core.domain;

/// The Form.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public class Form {
    private int id;
    private String data;

    public Form() {

    }

    public Form(int id, String data) {
        this.id = id;
        this.data = data;
    }

    public long getId() {
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