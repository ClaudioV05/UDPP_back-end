package com.udpp.app.application.core.service;

import com.udpp.app.infrastructure.adapter.in.api.dto.MetaTableDto;
import com.udpp.app.infrastructure.adapter.in.api.exceptionhandler.GlobalException;
import com.udpp.app.infrastructure.adapter.in.api.mapper.Embedded;
import com.udpp.app.infrastructure.adapter.in.api.mapper.MetaDataDto;
import com.udpp.app.application.ports.*;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.LinkedHashSet;
import java.util.List;

@Service
public class MetadataService implements MetadataServicePort {
    private final ArchitectureServicePort _architectureService;
    private final DatabaseServicePort _databaseService;
    private final DatabaseEngineerServicePort _databaseEngineerService;
    private final DevelopmentEnvironmentServicePort _developmentEnvironmentService;
    private final ParameterServicePort _parameterService;
    private final ValidationServicePort _validationService;
    private final MapperServicePort _mapperService;
    private final FormServicePort _formService;
    private final LogServicePort logService;

    public MetadataService(ArchitectureService architectureService, DatabaseServicePort databaseService, DatabaseEngineerServicePort databaseEngineerService, DevelopmentEnvironmentServicePort developmentEnvironmentService, ParameterServicePort parameterService, ValidationServicePort validationService, MapperServicePort mapperService, FormServicePort formService, LogServicePort logService) {
        this._databaseService = databaseService;
        this._databaseEngineerService = databaseEngineerService;
        this._developmentEnvironmentService = developmentEnvironmentService;
        this._architectureService = architectureService;
        this._parameterService = parameterService;
        this._validationService = validationService;
        this._mapperService = mapperService;
        this._formService = formService;
        this.logService = logService;
    }

    @Override
    public List<MetaDataDto> generateMetaData(List<com.udpp.app.infrastructure.adapter.in.api.dto.MetaDataDto> lstMetadata, BindingResult bindingResult) {
        try {
            var result = this._validationService.getErrorMessages(bindingResult);

            if (!result.isEmpty()) {
                throw new GlobalException(result.toString());
            }
            logService.registerLog(MetadataService.class.getName(), "continue here.");

            return null;
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public List<MetaTableDto> generateMetaTable(List<MetaTableDto> lstMetatable) {
        try {
            throw new UnsupportedOperationException("Not implemented.");
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public Embedded getTitle() {
        try {
            return this._mapperService.getTitle(this._parameterService.getTitle());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public Embedded getDescription() {
        try {
            return this._mapperService.getDescription(this._parameterService.getDescription());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public LinkedHashSet<Embedded> getArchitectureData() {
        try {
            return this._mapperService.convertLstArchitecture(this._architectureService.getData());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public LinkedHashSet<Embedded> getDatabasesData() {
        try {
            return this._mapperService.convertLstDatabase(this._databaseService.getData());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public LinkedHashSet<Embedded> getDatabasesEngineerData() {
        try {
            return this._mapperService.convertLstDatabaseEngineer(this._databaseEngineerService.getData());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public LinkedHashSet<Embedded> getDevelopmentEnvironmentData() {
        try {
            return this._mapperService.convertLstDevelopmentEnvironment(this._developmentEnvironmentService.getData());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public LinkedHashSet<Embedded> getFormData() {
        try {
            return this._mapperService.convertLstForm(this._formService.getData());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }
}