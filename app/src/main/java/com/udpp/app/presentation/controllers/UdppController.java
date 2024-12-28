package com.udpp.app.presentation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udpp.app.presentation.dtos.DtoMetaData;

@RestController
@RequestMapping("udpp")
public final class UdppController {

	@GetMapping(value = { "/udppInformation" })
	public String udppInformation() {
		return "Unified development platform";
	}
	
	@PostMapping(value = { "/metadata" })
	public DtoMetaData metadata(@RequestBody DtoMetaData dtoMetaData) {
		
		DtoMetaData resultDtoMetaData = new DtoMetaData();
		resultDtoMetaData.setData(dtoMetaData.getData());
		resultDtoMetaData.setArchitecture(dtoMetaData.getArchitecture());

		return resultDtoMetaData;
	}
}