package com.udpp.app.adapter.inbound.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udpp.app.application.port.MetadataServicePort;

/// Controller Unified Development Power Platform parameters - UDPP.
/// --
/// @since 1.0
/// @author Claudiomildo Ventura.
@RestController
@RequestMapping(value = "/api/udppparameters")
public final class UdppParametersController {
	private final MetadataServicePort _metadataService;
	private static final String INFORMATION_PATH = "/solutionTitle";

	@Autowired
	UdppParametersController(MetadataServicePort metadataService) {
		_metadataService = metadataService;
	}

	/// The solution title.
	///
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return String.
	@GetMapping(value = { INFORMATION_PATH })
	public ResponseEntity<String> titleName() {
		return new ResponseEntity<>(_metadataService.getSolutionTitle(), HttpStatus.OK);
	}
}