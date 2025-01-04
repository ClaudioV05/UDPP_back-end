package com.udpp.app.presentation.dtos;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/** Metadata - data transfer object. */
@Getter
@Setter
public final class MetaDataDto {

	@NotNull(message = "do not be empty")
	@NotEmpty(message = "do not be empty")
	@JsonProperty("data")
	private String data;

	@Min(1)
	@Max(3)
	@JsonProperty("architecture")
	private int architecture;
}