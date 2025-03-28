package com.udpp.app.infrastructure.adapter.in.api.dto;

/// The MetaTable (Data transfer object).
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public final class MetaTableDto {
    private int id;
    private String data;

    public MetaTableDto(int id, String data) {
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
