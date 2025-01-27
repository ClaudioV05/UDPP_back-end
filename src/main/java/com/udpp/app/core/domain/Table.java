package com.udpp.app.core.domain;

import java.util.List;

/// The Table.
/// @since 1.0
/// @author Claudiomildo Ventura.
public class Table {
    /// Id.
    private long id;

    /// Name.
    private String Name;

    /// Auto create.
    private boolean AutoCreate;

    List<Field> fields;

    public Table(long id, String name, boolean autoCreate, List<Field> fields) {
        this.id = id;
        Name = name;
        AutoCreate = autoCreate;
        this.fields = fields;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public boolean getAutoCreate() {
        return AutoCreate;
    }

    public void setAutoCreate(boolean autoCreate) {
        AutoCreate = autoCreate;
    }

    public List<Field> getFields() {
        return fields;
    }

    public void setFields(List<Field> fields) {
        this.fields = fields;
    }
}