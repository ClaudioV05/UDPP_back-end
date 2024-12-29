package com.udpp.app.presentation.dtos;

/** Metadata - data transfer object. */
public class MetaDataDto {
	
	private String data;
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