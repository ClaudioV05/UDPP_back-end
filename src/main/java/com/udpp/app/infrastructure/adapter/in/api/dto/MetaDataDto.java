package com.udpp.app.infrastructure.adapter.in.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;

/// The MetaData (Data transfer object).
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public final class MetaDataDto {
    /// The data schema.
    @NotNull(message = "do not be empty")
    @NotEmpty(message = "do not be empty")
    @JsonProperty("data")
    private String data;

    /// The identifier of architecture.
    @Positive
    @Min(value = 1, message = "should not be less than 1")
    @Max(value = 3, message = "should not be more than 3")
    @JsonProperty("architecture")
    private int architecture;

    /// The identifier of development Environment.
    @Positive
    @Min(value = 1, message = "should not be less than 1")
    @Max(value = 3, message = "should not be more than 3")
    @JsonProperty("idDevelopmentEnvironment")
    private int idDevelopmentEnvironment;

    /// The identifier of databases.
    @Positive
    @Min(value = 1, message = "should not be less than 1")
    @Max(value = 3, message = "should not be more than 3")
    @JsonProperty("idDatabase")
    private int idDatabase;

    /// The identifier of database engine.
    @Positive
    @Min(value = 1, message = "should not be less than 1")
    @Max(value = 3, message = "should not be more than 3")
    @JsonProperty("idDatabaseEngine")
    private int idDatabaseEngine;

    /// The identifier of forms.
    @Positive
    @Min(value = 1, message = "should not be less than 1")
    @Max(value = 3, message = "should not be more than 3")
    @JsonProperty("idForms")
    private int idForms;

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getArchitecture() {
        return architecture;
    }

    public void setArchitecture(int architecture) {
        this.architecture = architecture;
    }

    public int getIdDevelopmentEnvironment() {
        return idDevelopmentEnvironment;
    }

    public void setIdDevelopmentEnvironment(int idDevelopmentEnvironment) {
        this.idDevelopmentEnvironment = idDevelopmentEnvironment;
    }

    public int getIdDatabase() {
        return idDatabase;
    }

    public void setIdDatabase(int idDatabase) {
        this.idDatabase = idDatabase;
    }

    public int getIdDatabaseEngine() {
        return idDatabaseEngine;
    }

    public void setIdDatabaseEngine(int idDatabaseEngine) {
        this.idDatabaseEngine = idDatabaseEngine;
    }

    public int getIdForms() {
        return idForms;
    }

    public void setIdForms(int idForms) {
        this.idForms = idForms;
    }
}