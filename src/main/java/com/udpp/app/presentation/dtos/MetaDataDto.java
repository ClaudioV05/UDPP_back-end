package com.udpp.app.presentation.dtos;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

/** Metadata - data transfer object. */
public class MetaDataDto {
	
	@NotNull
	@NotBlank(message = "Please provide a data")
	private String data;
	
	//@NotNull
	//@NotBlank(message = "Please provide a architecture")
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