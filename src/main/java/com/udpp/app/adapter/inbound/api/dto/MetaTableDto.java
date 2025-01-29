package com.udpp.app.adapter.inbound.api.dto;

/// The MetaTable (Data transfer object).
/// @since 1.0
/// @author Claudiomildo Ventura.
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
