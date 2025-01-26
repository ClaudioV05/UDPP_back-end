package com.udpp.app.adapter.inbound.api.controller;

import com.udpp.app.core.constant.ControllerParameter;
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
@RequestMapping(value = ControllerParameter.UDPP_PARAMETER_PATH)
public final class UdppParametersController {
	private final MetadataServicePort _metadataService;

	@Autowired
	UdppParametersController(MetadataServicePort metadataService) {
		_metadataService = metadataService;
	}

	/// The application title.
	///
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return String.
	@GetMapping(value = { ControllerParameter.TITLE_ENDPOINT_PATH })
	public ResponseEntity<String> applicationTitle() {
		return new ResponseEntity<>(_metadataService.getTitle(), HttpStatus.OK);
	}

	/// The application description.
	///
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return String.
	@GetMapping(value = { ControllerParameter.DESCRIPTION_ENDPOINT_PATH })
	public ResponseEntity<String> applicationDescription() {
		return new ResponseEntity<>(_metadataService.getDescription(), HttpStatus.OK);
	}
}