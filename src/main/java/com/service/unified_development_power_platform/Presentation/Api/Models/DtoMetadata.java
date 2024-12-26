package com.service.unified_development_power_platform.Presentation.Api.Models;

import org.springframework.lang.Nullable;

import com.fasterxml.jackson.annotation.JsonProperty;

/** The data transfer object - Meta Data. */
public class DtoMetadata {

	/** The database schema. */
	@Nullable
	@JsonProperty("databaseSchema")
	public String DatabaseSchema;

	/** The identify of architecture. */
	@JsonProperty("architecture")
	public int Architecture;

	/** The identify of development Environment. */
	@JsonProperty("idDevelopmentEnvironment")
	public int IdDevelopmentEnvironment;

	/** The identify of databases. */
	@JsonProperty("idDatabases")
	public int IdDatabases;

	/** The identify of databases engine. */
	@JsonProperty("idDatabasesEngine")
	public int IdDatabasesEngine;

	/** The identify of forms. */
	@JsonProperty("idForms")
	public int IdForms;
}