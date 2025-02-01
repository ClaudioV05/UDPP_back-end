package com.udpp.app.application.service;

import com.udpp.app.adapter.inbound.api.mapper.Embedded;
import com.udpp.app.adapter.inbound.api.mapper.MetaDataDto;
import com.udpp.app.application.port.MapperServicePort;
import com.udpp.app.core.domain.*;
import org.modelmapper.ModelMapper;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class MapperService implements MapperServicePort {

    private final ModelMapper _mapper;

    public MapperService(ModelMapper _mapper) {
        this._mapper = _mapper;
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
        MetaDataDto metaDataDto = this._mapper.map(obj, MetaDataDto.class);
        return this._mapper.map(metaDataDto, Embedded.class);
    }

    /// Convert to embedded.
    private Embedded convertToEmbedded(String obj) {
        MetaDataDto metaDataDto = this._mapper.map(new MetaDataDto(0, obj), MetaDataDto.class);
        return this._mapper.map(metaDataDto, Embedded.class);
    }
}