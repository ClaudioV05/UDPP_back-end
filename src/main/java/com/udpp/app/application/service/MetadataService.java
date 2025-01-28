package com.udpp.app.application.service;

import com.udpp.app.adapter.inbound.api.dto.MetaDataDto;
import com.udpp.app.adapter.inbound.api.dto.MetaTableDto;
import com.udpp.app.adapter.inbound.api.exceptionhandler.GlobalException;
import com.udpp.app.application.port.*;
import com.udpp.app.core.domain.Architecture;
import com.udpp.app.core.domain.Database;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.List;

@Service
public class MetadataService implements MetadataServicePort {
	private final ArchitectureServicePort _architectureService;
	private final DatabaseServicePort _databaseService;
	private final ParameterServicePort _parameterService;
	private final ValidationServicePort _validationService;

	@Autowired
	MetadataService(ArchitectureService architectureService,
					DatabaseServicePort databaseService,
					ParameterServicePort parameterService,
					ValidationServicePort validationService) {
		this._databaseService = databaseService;
		this._architectureService = architectureService;
		this._parameterService = parameterService;
		this._validationService = validationService;
	}

	@Override
	public List<MetaDataDto> generateMetaData(MetaDataDto metadata, BindingResult bindingResult) {
		try {
			var result = _validationService.getErrorMessages(bindingResult);

			if (!result.isEmpty()){
				throw new GlobalException(result.toString());
			}
			// continue here.

			return null;
		} catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public List<MetaTableDto> generateMetaTable(MetaTableDto metatable) {
		try {
			throw new UnsupportedOperationException("Not implemented.");
		} catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public String getTitle() {
		return _parameterService.getTitle();
	}

	@Override
	public String getDescription() {
		return _parameterService.getDescription();
	}

	@Override
	public List<Architecture> getArchitecturesDescription() {
	return _architectureService.getArchitecturesDescription();
	}

	@Override
	public List<Database> getDatabasesDescription() {
		return _databaseService.getDatabasesDescription();
	}
}