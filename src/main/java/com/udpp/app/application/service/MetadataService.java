package com.udpp.app.application.service;

import com.udpp.app.adapter.inbound.api.mapper.MetaDataDto;
import com.udpp.app.adapter.inbound.api.dto.MetaTableDto;
import com.udpp.app.adapter.inbound.api.exceptionhandler.GlobalException;
import com.udpp.app.application.port.*;

import org.modelmapper.ModelMapper;
import org.springframework.validation.BindingResult;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.stream.Collectors;

public class MetadataService implements MetadataServicePort {
	private final ModelMapper _mapper;
	private final ArchitectureServicePort _architectureService;
	private final DatabaseServicePort _databaseService;
	private final DatabaseEngineerServicePort _databaseEngineerService;
	private final DevelopmentEnvironmentServicePort _developmentEnvironmentService;
	private final ParameterServicePort _parameterService;
	private final ValidationServicePort _validationService;
	private final MapperServicePort _mapperServicePort;

	public MetadataService(ModelMapper mapper,
						   ArchitectureService architectureService,
						   DatabaseServicePort databaseService,
						   DatabaseEngineerServicePort databaseEngineerService,
						   DevelopmentEnvironmentServicePort developmentEnvironmentService,
						   ParameterServicePort parameterService,
						   ValidationServicePort validationService,
						   MapperServicePort mapperServicePort) {
		this._mapper = mapper;
		this._databaseService = databaseService;
		this._databaseEngineerService = databaseEngineerService;
		this._developmentEnvironmentService = developmentEnvironmentService;
		this._architectureService = architectureService;
		this._parameterService = parameterService;
		this._validationService = validationService;
		this._mapperServicePort = mapperServicePort;
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
			return this._mapper.map(this._parameterService.getTitle(), MetaDataDto.class);
		} catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public MetaDataDto getDescription() {
		try {
			return this._mapper.map(this._parameterService.getDescription(), MetaDataDto.class);
		} catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public LinkedHashSet<MetaDataDto> getArchitectureData() {
		try {
			return this._mapperServicePort.convertLstArchitecture(this._architectureService.getData());
		} catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public LinkedHashSet<MetaDataDto> getDatabasesData() {
		try {
			return this._mapperServicePort.convertLstDatabase(this._databaseService.getData());
		}catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public LinkedHashSet<MetaDataDto> getDatabasesEngineerData() {
		try {
			return this._mapperServicePort.convertLstDatabaseEngineer(this._databaseEngineerService.getData());
		}catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public LinkedHashSet<MetaDataDto> getDevelopmentEnvironmentData() {
		try {
			return this._mapperServicePort.convertLstDevelopmentEnvironment(this._developmentEnvironmentService.getData());
		}catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}
}