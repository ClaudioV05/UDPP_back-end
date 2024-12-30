package com.udpp.app.presentation.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udpp.app.application.interfaces.MetadataService;
import com.udpp.app.presentation.dtos.MetaDataDto;
import com.udpp.app.presentation.dtos.MetaTableDto;

/**
 * Controller Unified Development Power Platform - UDPP.
 * <p>
 * --
 *
 * @since 1.0
 * @author Claudiomildo Ventura.
 * @see
 */
@RestController
@RequestMapping("udpp")
public final class UdppController {

	private final MetadataService _metadataService;
	private static final String METADATA_PATH = "/metadata";
	private static final String METATABLE_PATH = "/metatable";
	
	
	UdppController(MetadataService metadataService){
		_metadataService = metadataService;
	}

	/**
	 * To receive the schema of database and do the creation of the tables with
	 * their fields.
	 *
	 * @param metaData
	 *               <p>
	 *               --
	 *
	 * @since 1.0
	 * @return MetaDataDto
	 * @author Claudiomildo Ventura.
	 * @see
	 */
	@PostMapping(value = { METADATA_PATH })
	public MetaDataDto metaData(@RequestBody MetaDataDto metaData) {

		MetaDataDto resultMetaData = new MetaDataDto();
		resultMetaData.setData(metaData.getData());
		resultMetaData.setArchitecture(metaData.getArchitecture());
		return resultMetaData;
	}

	/**
	 * To receive the table(s) with their field(s) that will generate the magic
	 * solution - UDPP.
	 * 
	 * @param metaTable
	 *               <p>
	 *               --
	 *
	 * @since 1.0
	 * @return MetaTableDto
	 * @author Claudiomildo Ventura.
	 * @see
	 */
	@PostMapping(value = { METATABLE_PATH })
	public MetaTableDto metaTable(@RequestBody MetaTableDto metaTable) {

		MetaTableDto resultMetaTable = new MetaTableDto();
		return resultMetaTable;
	}
}