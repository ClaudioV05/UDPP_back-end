package com.udpp.app.presentation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udpp.app.application.interfaces.MetadataService;
import com.udpp.app.presentation.dtos.DataDto;

/**
 * Controller Unified Development Power Platform parameters - UDPP.
 * <p>
 * --
 *
 * @since 1.0
 * @author Claudiomildo Ventura.
 * @see
 */
@RestController
@RequestMapping("UdppParameters")
public final class UdppParametersController {

	private final MetadataService _metadataService;
	private static final String INFORMATION_PATH = "/information";

	UdppParametersController(MetadataService metadataService) {
		_metadataService = metadataService;
	}

	@GetMapping(value = { INFORMATION_PATH })
	public DataDto udppInformation() {

		DataDto data = new DataDto();
		data.setInformation(_metadataService.getUDPPSelectParametersInformation());

		return data;
	}
}