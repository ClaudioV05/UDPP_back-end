package com.udpp.app.application.service;

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
    public MetaDataDto getTitle(String title) {
        return this._mapper.map(title, MetaDataDto.class);
    }

    @Override
    public MetaDataDto getDescription(String description) {
        return this._mapper.map(description, MetaDataDto.class);
    }

    @Override
    public LinkedHashSet<MetaDataDto> convertLstArchitecture(LinkedHashSet<Architecture> lstArchitecture) {
        return lstArchitecture.stream()
                .map(source -> this._mapper.map(source, MetaDataDto.class))
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    @Override
    public LinkedHashSet<MetaDataDto> convertLstDatabase(LinkedHashSet<Database> lstDatabase) {
        return lstDatabase.stream()
                .map(source -> this._mapper.map(source, MetaDataDto.class))
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    @Override
    public LinkedHashSet<MetaDataDto> convertLstDatabaseEngineer(LinkedHashSet<DatabaseEngineer> lstDatabaseEngineer) {
        return lstDatabaseEngineer.stream()
                .map(source -> this._mapper.map(source, MetaDataDto.class))
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    @Override
    public LinkedHashSet<MetaDataDto> convertLstDevelopmentEnvironment(LinkedHashSet<DevelopmentEnvironment> lstDevelopmentEnvironment) {
        return lstDevelopmentEnvironment.stream()
                .map(source -> this._mapper.map(source, MetaDataDto.class))
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }

    @Override
    public LinkedHashSet<MetaDataDto> convertLstForm(LinkedHashSet<Form> lstForm) {
        return lstForm.stream()
                .map(source -> this._mapper.map(source, MetaDataDto.class))
                .collect(Collectors.toCollection(LinkedHashSet::new));
    }
}