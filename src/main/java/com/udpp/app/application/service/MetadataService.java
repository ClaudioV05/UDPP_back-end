package com.udpp.app.application.service;

import com.udpp.app.adapter.inbound.api.mapper.MetaDataDto;
import com.udpp.app.adapter.inbound.api.dto.MetaTableDto;
import com.udpp.app.adapter.inbound.api.exceptionhandler.GlobalException;
import com.udpp.app.application.port.MetadataServicePort;
import com.udpp.app.application.port.ArchitectureServicePort;
import com.udpp.app.application.port.DatabaseServicePort;
import com.udpp.app.application.port.DatabaseEngineerServicePort;
import com.udpp.app.application.port.DevelopmentEnvironmentServicePort;
import com.udpp.app.application.port.ParameterServicePort;
import com.udpp.app.application.port.ValidationServicePort;
import com.udpp.app.core.domain.Architecture;
import com.udpp.app.core.domain.Database;
import com.udpp.app.core.domain.DatabaseEngineer;
import com.udpp.app.core.domain.DevelopmentEnvironment;

import org.modelmapper.ModelMapper;
import org.springframework.validation.BindingResult;

import java.util.List;

public class MetadataService implements MetadataServicePort {
	private final ModelMapper _mapper;
	private MetaDataDto _metaDataDto;
	private final ArchitectureServicePort _architectureService;
	private final DatabaseServicePort _databaseService;
	private final DatabaseEngineerServicePort _databaseEngineerService;
	private final DevelopmentEnvironmentServicePort _developmentEnvironmentService;
	private final ParameterServicePort _parameterService;
	private final ValidationServicePort _validationService;

	public MetadataService(ModelMapper mapper,
						   MetaDataDto metaDataDto,
						   ArchitectureService architectureService,
						   DatabaseServicePort databaseService,
						   DatabaseEngineerServicePort databaseEngineerService,
						   DevelopmentEnvironmentServicePort developmentEnvironmentService,
						   ParameterServicePort parameterService,
						   ValidationServicePort validationService) {
		this._mapper = mapper;
		this._metaDataDto = metaDataDto;
		this._databaseService = databaseService;
		this._databaseEngineerService = databaseEngineerService;
		this._developmentEnvironmentService = developmentEnvironmentService;
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
	public MetaDataDto getTitle() {
		//MetaDataDto metaDataDto = new MetaDataDto();
		var metadata = _parameterService.getTitle();
		//metaDataDto.setData(metadata.getData());

		return null;//metaDataDto;
	}

	@Override
	public MetaDataDto getDescription() {
		try {
			return _mapper.map(_parameterService.getDescription(), MetaDataDto.class);
		} catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public List<Architecture> getArchitecturesDescription() {
		try {
			return _architectureService.getArchitecturesDescription();
		} catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public List<Database> getDatabasesDescription() {
		try {
			return _databaseService.getDatabasesDescription();
		}catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public List<DatabaseEngineer> getDatabasesEngineerDescription() {
		try {
			return _databaseEngineerService.getDatabasesEngineerDescription();
		}catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public List<DevelopmentEnvironment> getDevelopmentEnvironmentDescription() {
		try {
			return _developmentEnvironmentService.getDevelopmentEnvironmentDescription();
		}catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}
}