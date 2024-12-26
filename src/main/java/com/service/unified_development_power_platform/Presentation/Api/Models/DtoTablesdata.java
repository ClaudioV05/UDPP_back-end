package com.service.unified_development_power_platform.Presentation.Api.Models;

import java.util.List;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

/** The data transfer object - Tables Data. */
public class DtoTablesdata {

	/** The list of tables. */
	@Nullable
	@JsonProperty("tables")
	public List<String> Tables;

}