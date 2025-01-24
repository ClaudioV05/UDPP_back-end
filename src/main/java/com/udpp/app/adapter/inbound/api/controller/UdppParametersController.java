package com.udpp.app.adapter.inbound.api.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udpp.app.application.port.MetadataServicePort;
import com.udpp.app.adapter.inbound.api.dto.DataDto;

/// Controller Unified Development Power Platform parameters - UDPP.
///
/// --
///
/// @since 1.0
/// @author Claudiomildo Ventura.
/// @see
@RestController
@RequestMapping(value = "/api/udppparameters")
public final class UdppParametersController {

	private final MetadataServicePort _metadataService;
	private static final String INFORMATION_PATH = "/information";

	UdppParametersController(MetadataServicePort metadataService) {
		_metadataService = metadataService;
	}

	@GetMapping(value = { INFORMATION_PATH })
	public ResponseEntity<DataDto> udppInformation() {

		DataDto data = new DataDto();
		data.setInformation(_metadataService.getUDPPSelectParametersInformation());
		return new ResponseEntity<>(data, HttpStatus.OK);
	}
}