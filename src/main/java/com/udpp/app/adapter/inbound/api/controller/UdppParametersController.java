package com.udpp.app.adapter.inbound.api.controller;

import com.udpp.app.core.constant.ControllerConst;
import com.udpp.app.core.domain.Architecture;
import com.udpp.app.core.domain.Database;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udpp.app.application.port.MetadataServicePort;

import java.util.List;

/// Unified Development Power Platform parameters - UDPP controller.
/// --
/// @since 1.0
/// @author Claudiomildo Ventura.
@RestController
@RequestMapping(value = ControllerConst.UDPP_PARAMETER_PATH)
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
	@GetMapping(value = { ControllerConst.TITLE_ENDPOINT_PATH })
	public ResponseEntity<String> applicationTitle() {
		return new ResponseEntity<>(_metadataService.getTitle(), HttpStatus.OK);
	}

	/// The application description.
	///
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return String.
	@GetMapping(value = { ControllerConst.DESCRIPTION_ENDPOINT_PATH })
	public ResponseEntity<String> applicationDescription() {
		return new ResponseEntity<>(_metadataService.getDescription(), HttpStatus.OK);
	}

	/// The architecture description.
	///
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return List of Architecture.
	@GetMapping(value = { ControllerConst.ARCHITECTURES_ENDPOINT_PATH })
	public ResponseEntity<List<Architecture>> architectures() {
		return new ResponseEntity<>(_metadataService.getArchitecturesDescription(), HttpStatus.OK);
	}

	/// The database description.
	///
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return List of Database.
	@GetMapping(value = { ControllerConst.DATABASES_ENDPOINT_PATH })
	public ResponseEntity<List<Database>> databases() {
		return new ResponseEntity<>(_metadataService.getDatabasesDescription(), HttpStatus.OK);
	}
}