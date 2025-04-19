package com.udpp.app.domain.usecase;

import com.udpp.app.adapter.generator.dto.request.MetaData;
import com.udpp.app.adapter.generator.dto.request.MetaTable;
import com.udpp.app.adapter.generator.input.mapper.Embedded;
import com.udpp.app.adapter.generator.input.mapper.MetaDataDto;
import com.udpp.app.domain.exception.GlobalException;
import com.udpp.app.port.input.*;
import com.udpp.app.port.output.MetadataServicePort;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.LinkedHashSet;
import java.util.List;

@Service
public class MetadataUseCase implements MetadataServicePort {

    private static final Logger _log = LoggerFactory.getLogger(MetadataUseCase.class);

    private final ArchitectureUseCasePort architectureService;
    private final DatabaseUseCasePort databaseService;
    private final DatabaseEngineerUseCasePort databaseEngineerService;
    private final DevelopmentEnvironmentUseCasePort developmentEnvironmentService;
    private final ParameterUseCasePort parameterService;
    private final ValidationUseCasePort validationService;
    private final MapperUseCasePort mapperService;
    private final FormUseCasePort formService;
    private final DirectoryUseCasePort directoryService;

    public MetadataUseCase(ArchitectureUseCase architectureService,
                           DatabaseUseCasePort databaseService,
                           DatabaseEngineerUseCasePort databaseEngineerService,
                           DevelopmentEnvironmentUseCasePort developmentEnvironmentService,
                           ParameterUseCasePort parameterService,
                           ValidationUseCasePort validationService,
                           MapperUseCasePort mapperService,
                           FormUseCasePort formService,
                           DirectoryUseCasePort directoryService) {
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
    public List<MetaDataDto> generateMetaData(List<MetaData> lstMetadata, BindingResult bindingResult) {
        try {
            var resultError = this.validationService.getErrorMessages(bindingResult);

            if (!resultError.isEmpty()) {
                throw new GlobalException(resultError.toString());
            } else if (!lstMetadata.isEmpty()) {
                this.directoryService.generateDefault();
                // Create the folder.
                // Get the values and generate.
                _log.info("continue here. {}", lstMetadata);
                _log.info("Request to {}", Thread.currentThread().getStackTrace()[1].getMethodName());


            }

            return null;

        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public List<MetaTable> generateMetaTable(List<MetaTable> lstMetatable) {
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