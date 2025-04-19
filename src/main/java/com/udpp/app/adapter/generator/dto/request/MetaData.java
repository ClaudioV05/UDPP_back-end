package com.udpp.app.adapter.generator.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.*;

/// The MetaData (Data transfer object).
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public record MetaData(

        @NotNull(message = "do not be empty")
        @NotEmpty(message = "do not be empty")
        @JsonProperty("data")
        String data,

        @Positive
        @Min(value = 1, message = "should not be less than 1")
        @Max(value = 3, message = "should not be more than 3")
        @JsonProperty("architecture")
        int architecture,

        @Positive
        @Min(value = 1, message = "should not be less than 1")
        @Max(value = 3, message = "should not be more than 3")
        @JsonProperty("idDevelopmentEnvironment")
        int idDevelopmentEnvironment,

        @Positive
        @Min(value = 1, message = "should not be less than 1")
        @Max(value = 3, message = "should not be more than 3")
        @JsonProperty("idDatabase")
        int idDatabase,

        @Positive
        @Min(value = 1, message = "should not be less than 1")
        @Max(value = 3, message = "should not be more than 3")
        @JsonProperty("idDatabaseEngine")
        int idDatabaseEngine,

        @Positive
        @Min(value = 1, message = "should not be less than 1")
        @Max(value = 3, message = "should not be more than 3")
        @JsonProperty("idForms")
        int idForms
) { }