package com.udpp.app.application.service;

import com.udpp.app.adapter.inbound.api.mapper.MetaDataDto;
import com.udpp.app.adapter.inbound.api.dto.MetaTableDto;
import com.udpp.app.adapter.inbound.api.exceptionhandler.GlobalException;
import com.udpp.app.application.port.*;

import org.springframework.validation.BindingResult;

import java.util.LinkedHashSet;
import java.util.List;

public class MetadataService implements MetadataServicePort {
	private final ArchitectureServicePort _architectureService;
	private final DatabaseServicePort _databaseService;
	private final DatabaseEngineerServicePort _databaseEngineerService;
	private final DevelopmentEnvironmentServicePort _developmentEnvironmentService;
	private final ParameterServicePort _parameterService;
	private final ValidationServicePort _validationService;
	private final MapperServicePort _mapperService;
	private final FormServicePort _formService;

	public MetadataService(ArchitectureService architectureService,
						   DatabaseServicePort databaseService,
						   DatabaseEngineerServicePort databaseEngineerService,
						   DevelopmentEnvironmentServicePort developmentEnvironmentService,
						   ParameterServicePort parameterService,
						   ValidationServicePort validationService,
						   MapperServicePort mapperService,
						   FormServicePort formService) {
		this._databaseService = databaseService;
		this._databaseEngineerService = databaseEngineerService;
		this._developmentEnvironmentService = developmentEnvironmentService;
		this._architectureService = architectureService;
		this._parameterService = parameterService;
		this._validationService = validationService;
		this._mapperService = mapperService;
		this._formService = formService;
	}

	@Override
	public List<com.udpp.app.adapter.inbound.api.mapper.MetaDataDto> generateMetaData(com.udpp.app.adapter.inbound.api.dto.MetaDataDto metadata, BindingResult bindingResult) {
		try {
			var result = this._validationService.getErrorMessages(bindingResult);

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
	public MetaDataDto getTitle() {
		try {
			return this._mapperService.getTitle(this._parameterService.getTitle());
		} catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public MetaDataDto getDescription() {
		try {
			return this._mapperService.getDescription(this._parameterService.getDescription());
		} catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public LinkedHashSet<MetaDataDto> getArchitectureData() {
		try {
			return this._mapperService.convertLstArchitecture(this._architectureService.getData());
		} catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public LinkedHashSet<MetaDataDto> getDatabasesData() {
		try {
			return this._mapperService.convertLstDatabase(this._databaseService.getData());
		}catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public LinkedHashSet<MetaDataDto> getDatabasesEngineerData() {
		try {
			return this._mapperService.convertLstDatabaseEngineer(this._databaseEngineerService.getData());
		}catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public LinkedHashSet<MetaDataDto> getDevelopmentEnvironmentData() {
		try {
			return this._mapperService.convertLstDevelopmentEnvironment(this._developmentEnvironmentService.getData());
		}catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public LinkedHashSet<MetaDataDto> getFormData() {
		try {
			return this._mapperService.convertLstForm(this._formService.getData());
		}catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}
}