package com.udpp.app.application.service;

import org.springframework.beans.factory.annotation.Autowired;

import com.udpp.app.application.port.MetadataServicePort;
import com.udpp.app.application.port.ValidationServicePort;
import org.springframework.stereotype.Service;

/// The Metadata service.
///
/// @since 1.0
/// @author Claudiomildo Ventura.
/// @see
@Service
public class MetadataService implements MetadataServicePort {

	private final ValidationServicePort _validationService;

	@Autowired
	MetadataService(ValidationServicePort validationService) {
		_validationService = validationService;
	}

	@Override
	public String getUDPPSelectParametersInformation() {
		return "Unified Development Power Platform - UDPP";
	}

	/*@Override
	public Void udppReceiveAndSaveAllTablesAndFieldsOfSchemaDatabase(MetaDataDto metaData, BindingResult bindingResult) {

		try {
			MetaDataDto resultMetaData = new MetaDataDto();
			resultMetaData.setData(metaData.getData());
			resultMetaData.setArchitecture(metaData.getArchitecture());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return       null;
	}*/
}