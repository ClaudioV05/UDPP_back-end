package com.udpp.app.presentation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udpp.app.application.interfaces.UdppService;
import com.udpp.app.presentation.dtos.DataDto;
import com.udpp.app.presentation.dtos.MetaDataDto;
import com.udpp.app.presentation.dtos.MetaTableDto;

/**
 * Controller Unified Development Power Platform parameters - UDPP.
 * <p>
 * --
 *
 * @since 1.0
 * @see
 */
@RestController
@RequestMapping("UdppParameters")
public final class UdppParametersController {

	private static final String INFORMATION_PATH = "/information";
	
	private final UdppService _udppService;
	
	@Autowired
	UdppParametersController(UdppService udppService){
		_udppService = udppService;
	}

	@GetMapping(value = { INFORMATION_PATH })
	public DataDto udppInformation() {

		DataDto data = new DataDto();
		data.setInformation(_udppService.getUdppInformation());
		
		return data;
	}
}