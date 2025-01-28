package com.udpp.app.core.domain;

/// The Field.
/// @since 1.0
/// @author Claudiomildo Ventura.
public class Field {
    /// The table's id.
    public int idTables;
    /// Name.
    public String name;
    /// The type of field.
    public String typeField;
    /// The field will be auto create when generate the class.
    public boolean AutoCreate;
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
        return AutoCreate;
    }

    public void setAutoCreate(boolean autoCreate) {
        AutoCreate = autoCreate;
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
        isPrimaryKey = primaryKey;
    }

    public boolean getNull() {
        return isNull;
    }

    public void setNull(boolean aNull) {
        isNull = aNull;
    }
}