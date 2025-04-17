package com.udpp.app.domain.entity;

/// The Field.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public class Field {
    public int idTables;
    public String name;
    public String typeField;
    /// The field will be auto create when generate the class.
    public boolean autoCreate;
    /// The field length.
    public int fieldLength;
    /// Whether the field is primary key.
    public boolean isPrimaryKey;
    /// Whether the field has null value.
    public boolean isNull;

    public int getIdTables() {
        return idTables;
    }

    public void setIdTables(int idTables) {
        this.idTables = idTables;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTypeField() {
        return typeField;
    }

    public void setTypeField(String typeField) {
        this.typeField = typeField;
    }

    public boolean getAutoCreate() {
        return autoCreate;
    }

    public void setAutoCreate(boolean autoCreate) {
        this.autoCreate = autoCreate;
    }

    public int getFieldLength() {
        return fieldLength;
    }

    public void setFieldLength(int fieldLength) {
        this.fieldLength = fieldLength;
    }

    public boolean getPrimaryKey() {
        return isPrimaryKey;
    }

    public void setPrimaryKey(boolean primaryKey) {
        this.isPrimaryKey = primaryKey;
    }

    public boolean getNull() {
        return isNull;
    }

    public void setNull(boolean aNull) {
        this.isNull = aNull;
    }
}