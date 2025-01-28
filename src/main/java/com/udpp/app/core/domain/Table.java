package com.udpp.app.core.domain;

import java.util.List;

/// The Table.
/// @since 1.0
/// @author Claudiomildo Ventura.
public class Table {
    private int id;
    private String name;
    private boolean autoCreate;
    List<Field> fields;

    public Table(int id, String name, boolean autoCreate, List<Field> fields) {
        this.id = id;
        this.name = name;
        this.autoCreate = autoCreate;
        this.fields = fields;
    }

    public long getId() {
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

    public boolean getAutoCreate() {
        return autoCreate;
    }

    public void setAutoCreate(boolean autoCreate) {
        this.autoCreate = autoCreate;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
}