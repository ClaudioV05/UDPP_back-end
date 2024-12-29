package com.udpp.app.presentation.dtos;

/** Data - data transfer object. */
public class DataDto {

	private String information;

	public DataDto() {
		this.information = "Unified Development Power Platform - UDPP";
	}

	public String getInformation() {
		return information;
	}

	public void setInformation(String information) {
		this.information = information;
	}
}