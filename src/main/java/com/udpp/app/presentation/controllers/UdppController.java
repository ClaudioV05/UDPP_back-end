package com.udpp.app.presentation.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.udpp.app.presentation.dtos.MetaDataDto;

@RestController
@RequestMapping("udpp")
public final class UdppController {

	@GetMapping(value = { "/udppInformation" })
	public String udppInformation() {
		return "Unified development platform";
	}
	
	@PostMapping(value = { "/metadata" })
	public MetaDataDto metadata(@RequestBody MetaDataDto dtoMetaData) {
		
		MetaDataDto resultDtoMetaData = new MetaDataDto();
		resultDtoMetaData.setData(dtoMetaData.getData());
		resultDtoMetaData.setArchitecture(dtoMetaData.getArchitecture());

		return resultDtoMetaData;
	}
}