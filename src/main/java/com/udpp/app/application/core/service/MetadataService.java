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
    private final ArchitectureServicePort architectureService;
    private final DatabaseServicePort databaseService;
    private final DatabaseEngineerServicePort databaseEngineerService;
    private final DevelopmentEnvironmentServicePort developmentEnvironmentService;
    private final ParameterServicePort parameterService;
    private final ValidationServicePort validationService;
    private final MapperServicePort mapperService;
    private final FormServicePort formService;
    private final LogServicePort logService;

    public MetadataService(ArchitectureService architectureService, DatabaseServicePort databaseService, DatabaseEngineerServicePort databaseEngineerService, DevelopmentEnvironmentServicePort developmentEnvironmentService, ParameterServicePort parameterService, ValidationServicePort validationService, MapperServicePort mapperService, FormServicePort formService, LogServicePort logService) {
        this.databaseService = databaseService;
        this.databaseEngineerService = databaseEngineerService;
        this.developmentEnvironmentService = developmentEnvironmentService;
        this.architectureService = architectureService;
        this.parameterService = parameterService;
        this.validationService = validationService;
        this.mapperService = mapperService;
        this.formService = formService;
        this.logService = logService;
    }

    @Override
    public List<MetaDataDto> generateMetaData(List<com.udpp.app.infrastructure.adapter.in.api.dto.MetaDataDto> lstMetadata, BindingResult bindingResult) {
        try {
            var result = this.validationService.getErrorMessages(bindingResult);

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
            return this.mapperService.getTitle(this.parameterService.getTitle());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public Embedded getDescription() {
        try {
            return this.mapperService.getDescription(this.parameterService.getDescription());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public LinkedHashSet<Embedded> getArchitectureData() {
        try {
            return this.mapperService.convertLstArchitecture(this.architectureService.getData());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public LinkedHashSet<Embedded> getDatabasesData() {
        try {
            return this.mapperService.convertLstDatabase(this.databaseService.getData());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public LinkedHashSet<Embedded> getDatabasesEngineerData() {
        try {
            return this.mapperService.convertLstDatabaseEngineer(this.databaseEngineerService.getData());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public LinkedHashSet<Embedded> getDevelopmentEnvironmentData() {
        try {
            return this.mapperService.convertLstDevelopmentEnvironment(this.developmentEnvironmentService.getData());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public LinkedHashSet<Embedded> getFormData() {
        try {
            return this.mapperService.convertLstForm(this.formService.getData());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }
}