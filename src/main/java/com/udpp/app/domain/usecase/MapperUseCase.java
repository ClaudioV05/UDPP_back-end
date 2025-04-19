package com.udpp.app.domain.usecase;

import com.udpp.app.adapter.generator.input.mapper.Embedded;
import com.udpp.app.adapter.generator.input.mapper.MetaDataDto;
import com.udpp.app.domain.entity.*;
import com.udpp.app.port.input.MapperUseCasePort;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

@Service
public class MapperUseCase implements MapperUseCasePort {

    private final ModelMapper mapper;

    public MapperUseCase() {
        this.mapper = new ModelMapper();
    }

    @Override
    public Embedded getTitle(String title) {
        return this.convertToEmbedded(title);
    }

    @Override
    public Embedded getDescription(String description) {
        return this.convertToEmbedded(description);
    }

    @Override
    public LinkedHashSet<Embedded> convertLstArchitecture(LinkedHashSet<Architecture> lstArchitecture) {
        return lstArchitecture.stream()
                .map(this::convertToListEmbedded)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    @Override
    public LinkedHashSet<Embedded> convertLstDatabase(LinkedHashSet<Database> lstDatabase) {
        return lstDatabase.stream()
                .map(this::convertToListEmbedded)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    @Override
    public LinkedHashSet<Embedded> convertLstDatabaseEngineer(LinkedHashSet<DatabaseEngineer> lstDatabaseEngineer) {
        return lstDatabaseEngineer.stream()
                .map(this::convertToListEmbedded)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    @Override
    public LinkedHashSet<Embedded> convertLstDevelopmentEnvironment(LinkedHashSet<DevelopmentEnvironment> lstDevelopmentEnvironment) {
        return lstDevelopmentEnvironment.stream()
                .map(this::convertToListEmbedded)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    @Override
    public LinkedHashSet<Embedded> convertLstForm(LinkedHashSet<Form> lstForm) {
        return lstForm.stream()
                .map(this::convertToListEmbedded)
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    /// Convert to list of embedded.
    private Embedded convertToListEmbedded(Object obj) {
        MetaDataDto metaDataDto = this.mapper.map(obj, MetaDataDto.class);
        return this.mapper.map(metaDataDto, Embedded.class);
    }

    /// Convert to embedded.
    private Embedded convertToEmbedded(String obj) {
        MetaDataDto metaDataDto = this.mapper.map(new MetaDataDto(0, obj), MetaDataDto.class);
        return this.mapper.map(metaDataDto, Embedded.class);
    }
}