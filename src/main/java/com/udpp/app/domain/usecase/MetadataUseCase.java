package com.udpp.app.domain.usecase;

import com.udpp.app.adapter.generator.dto.request.MetaData;
import com.udpp.app.adapter.generator.dto.request.MetaTable;
import com.udpp.app.adapter.generator.input.mapper.Embedded;
import com.udpp.app.adapter.generator.input.mapper.MetaDataDto;
import com.udpp.app.domain.entity.Log;
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

    private final ArchitectureUseCasePort architectureUseCase;
    private final DatabaseUseCasePort databaseUseCase;
    private final DatabaseEngineerUseCasePort databaseEngineerUseCase;
    private final DevelopmentEnvironmentUseCasePort developmentEnvironmentUseCase;
    private final ParameterUseCasePort parameterUseCase;
    private final ValidationUseCasePort validationUseCase;
    private final MapperUseCasePort mapperUseCase;
    private final FormUseCasePort formUseCase;
    private final DirectoryUseCasePort directoryUseCase;

    public MetadataUseCase(ArchitectureUseCase architectureUseCase,
                           DatabaseUseCasePort databaseUseCase,
                           DatabaseEngineerUseCasePort databaseEngineerUseCase,
                           DevelopmentEnvironmentUseCasePort developmentEnvironmentUseCase,
                           ParameterUseCasePort parameterUseCase,
                           ValidationUseCasePort validationUseCase,
                           MapperUseCasePort mapperUseCase,
                           FormUseCasePort formUseCase,
                           DirectoryUseCasePort directoryUseCase) {
        this.databaseUseCase = databaseUseCase;
        this.databaseEngineerUseCase = databaseEngineerUseCase;
        this.developmentEnvironmentUseCase = developmentEnvironmentUseCase;
        this.architectureUseCase = architectureUseCase;
        this.parameterUseCase = parameterUseCase;
        this.validationUseCase = validationUseCase;
        this.mapperUseCase = mapperUseCase;
        this.formUseCase = formUseCase;
        this.directoryUseCase = directoryUseCase;
    }

    @Override
    public List<MetaDataDto> generateMetaData(List<MetaData> lstMetadata, BindingResult bindingResult) {
        try {
            var resultError = this.validationUseCase.getErrorMessages(bindingResult);

            if (!resultError.isEmpty()) {
                throw new GlobalException(resultError.toString());
            }

            if (!lstMetadata.isEmpty()) {
                this.directoryUseCase.generateDefault();
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

    @Log
    @Override
    public Embedded getTitle() {
        try {
            return this.mapperUseCase.getTitle(this.parameterUseCase.getTitle());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public Embedded getDescription() {
        try {
            return this.mapperUseCase.getDescription(this.parameterUseCase.getDescription());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public LinkedHashSet<Embedded> getArchitectureData() {
        try {
            return this.mapperUseCase.convertLstArchitecture(this.architectureUseCase.getData());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public LinkedHashSet<Embedded> getDatabasesData() {
        try {
            return this.mapperUseCase.convertLstDatabase(this.databaseUseCase.getData());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public LinkedHashSet<Embedded> getDatabasesEngineerData() {
        try {
            return this.mapperUseCase.convertLstDatabaseEngineer(this.databaseEngineerUseCase.getData());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public LinkedHashSet<Embedded> getDevelopmentEnvironmentData() {
        try {
            return this.mapperUseCase.convertLstDevelopmentEnvironment(this.developmentEnvironmentUseCase.getData());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }

    @Override
    public LinkedHashSet<Embedded> getFormData() {
        try {
            return this.mapperUseCase.convertLstForm(this.formUseCase.getData());
        } catch (Exception ex) {
            throw new GlobalException(ex.getMessage());
        }
    }
}