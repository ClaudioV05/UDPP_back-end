package com.udpp.app.application.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import com.udpp.app.application.interfaces.MetadataService;
import com.udpp.app.application.interfaces.ValidationService;
import com.udpp.app.infrastructure.domain.Table;
import com.udpp.app.infrastructure.domain.ErrorHandlers.ResponseBadRequestException;
import com.udpp.app.presentation.dtos.MetaDataDto;

@Service
public class MetadataServiceImpl implements MetadataService {

	private final ValidationService _validationService;

	@Autowired
	MetadataServiceImpl(ValidationService validationService) {
		_validationService = validationService;
	}

	@Override
	public String getUDPPSelectParametersInformation() {
		return "Unified Development Power Platform - UDPP";
	}

	@Override
	public List<Table> udppReceiveAndSaveAllTablesAndFieldsOfSchemaDatabase(MetaDataDto metaData, BindingResult bindingResult) {
		
		if (_validationService.existErrorMessages(bindingResult)) {
			throw new ResponseBadRequestException(_validationService.getErrorMessages(bindingResult).toString());
		}
		
		try {
			MetaDataDto resultMetaData = new MetaDataDto();
			resultMetaData.setData(metaData.getData());
			resultMetaData.setArchitecture(metaData.getArchitecture());
		} catch (Exception e) {
			// TODO: handle exception
		}
		
		return null;
	}
}