package com.udpp.app.presentation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udpp.app.presentation.dtos.DataDto;
import com.udpp.app.presentation.dtos.MetaDataDto;
import com.udpp.app.presentation.dtos.MetaTableDto;

/**
 * Controller Unified Development Power Platform - UDPP.
 * <p>
 * --
 *
 * @since 1.0
 * @see
 */
@RestController
@RequestMapping("udpp")
public final class UdppController {

	private static final String INFORMATION_PATH = "/information";
	private static final String METADATA_PATH = "/metadata";
	private static final String METATABLE_PATH = "/metatable";

	@GetMapping(value = { "/udppInformation" })
	public String udppInformation() {
		return "Unified development platform";
	}

	@GetMapping(value = { INFORMATION_PATH })
	public DataDto metaData() {

		DataDto data = new DataDto();
		return data;
	}

	/**
	 * To receive the schema of database and do the creation of the tables with
	 * their fields.
	 *
	 * @param string the string to be converted
	 *               <p>
	 *               --
	 *
	 * @since 1.0
	 * @return
	 * @see
	 * @author Claudiomildo Ventura
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
	 * @param string the string to be converted
	 *               <p>
	 *               --
	 *
	 * @since 1.0
	 * @return
	 * @see
	 * @author Claudiomildo Ventura
	 */
	@PostMapping(value = { METATABLE_PATH })
	public MetaTableDto metaTable(@RequestBody MetaTableDto metaTable) {

		MetaTableDto resultMetaTable = new MetaTableDto();
		return resultMetaTable;
	}
}