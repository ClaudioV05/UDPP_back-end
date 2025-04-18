package com.udpp.app.domain.service;

import com.udpp.app.adapter.generator.input.dto.MetaTableDto;
import com.udpp.app.domain.exception.GlobalException;
import com.udpp.app.adapter.generator.input.mapper.Embedded;
import com.udpp.app.adapter.generator.input.mapper.MetaDataDto;
import com.udpp.app.port.input.*;
import com.udpp.app.port.output.MetadataServicePort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.LinkedHashSet;
import java.util.List;

@Service
public class MetadataService implements MetadataServicePort {

    private static final Logger log = LoggerFactory.getLogger(MetadataService.class);

    private final ArchitectureServicePort architectureService;
    private final DatabaseServicePort databaseService;
    private final DatabaseEngineerServicePort databaseEngineerService;
    private final DevelopmentEnvironmentServicePort developmentEnvironmentService;
    private final ParameterServicePort parameterService;
    private final ValidationServicePort validationService;
    private final MapperServicePort mapperService;
    private final FormServicePort formService;
    private final DirectoryServicePort directoryService;

    public MetadataService(ArchitectureService architectureService,
                           DatabaseServicePort databaseService,
                           DatabaseEngineerServicePort databaseEngineerService,
                           DevelopmentEnvironmentServicePort developmentEnvironmentService,
                           ParameterServicePort parameterService,
                           ValidationServicePort validationService,
                           MapperServicePort mapperService,
                           FormServicePort formService,
                           DirectoryServicePort directoryService) {
        this.databaseService = databaseService;
        this.databaseEngineerService = databaseEngineerService;
        this.developmentEnvironmentService = developmentEnvironmentService;
        this.architectureService = architectureService;
        this.parameterService = parameterService;
        this.validationService = validationService;
        this.mapperService = mapperService;
        this.formService = formService;
        this.directoryService = directoryService;
    }

    @Override
    public List<MetaDataDto> generateMetaData(List<com.udpp.app.adapter.generator.input.dto.MetaDataDto> lstMetadata, BindingResult bindingResult) {
        try {
            var resultError = this.validationService.getErrorMessages(bindingResult);

            if (!resultError.isEmpty()) {
                throw new GlobalException(resultError.toString());
            } else if (!lstMetadata.isEmpty()){
                this.directoryService.generateDefault();
                // Create the folder.
                // Get the values and generate.
                log.info("continue here. {}", lstMetadata);
            }

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