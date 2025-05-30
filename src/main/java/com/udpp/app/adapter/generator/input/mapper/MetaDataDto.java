package com.udpp.app.adapter.generator.input.mapper;

public class MetaDataDto {
    private int id;
    private String data;

    public MetaDataDto() {
    }

    public MetaDataDto(int id, String data) {
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