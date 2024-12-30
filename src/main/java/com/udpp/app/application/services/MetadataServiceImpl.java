package com.udpp.app.application.services;

import org.springframework.stereotype.Service;

import com.udpp.app.application.interfaces.MetadataService;

@Service
public class MetadataServiceImpl implements MetadataService {

	@Override
	public String getUDPPSelectParametersInformation() {
		return "Unified Development Power Platform - UDPP";
	}
}