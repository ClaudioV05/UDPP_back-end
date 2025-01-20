package com.udpp.app.adapter.inbound.api.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;

/** Metadata - data transfer object. */
public final class MetaDataDto {

	@NotNull(message = "do not be empty")
	@NotEmpty(message = "do not be empty")
	@JsonProperty("data")
	private String data;

	@Min(1)
	@Max(3)
	@JsonProperty("architecture")
	private int architecture;

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
}