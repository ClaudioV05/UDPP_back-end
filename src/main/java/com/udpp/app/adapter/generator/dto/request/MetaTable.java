package com.udpp.app.adapter.generator.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.validation.constraints.NotNull;

/// The MetaTable (Data transfer object).
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public record MetaTable(

        @NotNull(message = "do not be empty")
        @JsonProperty("id")
        int id,

        @NotNull(message = "do not be empty")
        @JsonProperty("data")
        String data
) { }