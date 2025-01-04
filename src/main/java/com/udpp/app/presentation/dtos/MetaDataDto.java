package com.udpp.app.presentation.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

/** Metadata - data transfer object. */
@Getter
@Setter
public final class MetaDataDto {
	
	@NotNull
	@NotBlank(message = "Please provide a data")
	private String data;
	
	//@NotNull
	//@NotBlank(message = "Please provide a architecture")
	private int architecture;
}