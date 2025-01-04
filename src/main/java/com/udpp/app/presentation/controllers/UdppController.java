package com.udpp.app.presentation.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udpp.app.application.interfaces.MetadataService;
import com.udpp.app.presentation.dtos.MetaDataDto;
import com.udpp.app.presentation.dtos.MetaTableDto;
import com.udpp.app.presentation.globalexceptionhandler.ResponseBadRequestException;

import jakarta.validation.Valid;

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
@RequestMapping("/api/udpp")
public final class UdppController {

	private final MetadataService _metadataService;
	private static final String METADATA_PATH = "/metadata";
	private static final String METATABLE_PATH = "/metatable";

	UdppController(MetadataService metadataService) {
		_metadataService = metadataService;
	}

	/**
	 * To receive the schema of database and do the creation of the tables with
	 * their fields.
	 *
	 * @param metaData
	 *                 <p>
	 *                 --
	 *
	 * @since 1.0
	 * @return MetaDataDto
	 * @author Claudiomildo Ventura.
	 * @throws Exception
	 * @see
	 */
	@PostMapping(value = { METADATA_PATH })
	public ResponseEntity<MetaDataDto> metaData(@RequestBody @Valid MetaDataDto metaData, BindingResult bindingResult)
			throws Exception {

		if (bindingResult.hasErrors()) {
			throw new ResponseBadRequestException(this.getErrorMessages(bindingResult).toString());
		}

		MetaDataDto resultMetaData = new MetaDataDto();
		resultMetaData.setData(metaData.getData());
		resultMetaData.setArchitecture(metaData.getArchitecture());

		return new ResponseEntity<>(resultMetaData, HttpStatus.OK);
	}

	/**
	 * To receive the table(s) with their field(s) that will generate the magic
	 * solution - UDPP.
	 * 
	 * @param metaTable
	 *                  <p>
	 *                  --
	 *
	 * @since 1.0
	 * @return MetaTableDto
	 * @author Claudiomildo Ventura.
	 * @throws Exception
	 * @see
	 */
	@PostMapping(value = { METATABLE_PATH })
	public MetaTableDto metaTable(@RequestBody MetaTableDto metaTable) throws Exception {

		MetaTableDto resultMetaTable = new MetaTableDto();
		return resultMetaTable;
	}

	public List<String> getErrorMessages(BindingResult bindingResult) {
		return (List<String>) bindingResult.getAllErrors().stream().map(error -> {
			var defaultMessage = error.getDefaultMessage();

			if (error instanceof FieldError) {
				var fieldError = (FieldError) error;
				return String.format("%s %s", fieldError.getField(), defaultMessage);
			} else {
				return defaultMessage;
			}
		}).collect(Collectors.toList());
	}
}