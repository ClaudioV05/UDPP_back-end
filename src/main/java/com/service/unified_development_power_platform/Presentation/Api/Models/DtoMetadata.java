package com.service.unified_development_power_platform.Presentation.Api.Models;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/** The data transfer object - Meta Data. */
@ApiModel(value = "DtoMetadata", description = "The Dto Meta data")
public class DtoMetadata {

	/** The database schema. */
	@Nullable
	@JsonProperty("databaseSchema")
	// Swagger/OpenAPI.
	@ApiModelProperty(value = "Database Schema", required = true)
	public String DatabaseSchema;

	/** The identify of architecture. */
	@JsonProperty("architecture")
	@ApiModelProperty(required = true, value = "Architecture")
	public int Architecture;

	/** The identify of development Environment. */
	@JsonProperty("idDevelopmentEnvironment")
	@ApiModelProperty(required = true, value = "Id Development Environment")
	public int IdDevelopmentEnvironment;

	/** The identify of databases. */
	@JsonProperty("idDatabases")
	@ApiModelProperty(required = true, value = "Id Databases")
	public int IdDatabases;

	/** The identify of databases engine. */
	@JsonProperty("idDatabasesEngine")
	@ApiModelProperty(required = true, value = "Id Databases Engine")
	public int IdDatabasesEngine;

	/** The identify of forms. */
	@JsonProperty("idForms")
	@ApiModelProperty(required = true, value = "Id Forms")
	public int IdForms;
}