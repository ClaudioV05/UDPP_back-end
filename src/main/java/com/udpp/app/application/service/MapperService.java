package com.udpp.app.application.service;

import com.udpp.app.adapter.inbound.api.mapper.MetaDataDto;
import com.udpp.app.application.port.MapperServicePort;
import com.udpp.app.core.domain.Architecture;
import com.udpp.app.core.domain.Database;
import com.udpp.app.core.domain.DatabaseEngineer;
import com.udpp.app.core.domain.DevelopmentEnvironment;
import org.modelmapper.ModelMapper;

import java.util.LinkedHashSet;
import java.util.stream.Collectors;

public class MapperService implements MapperServicePort {

    private final ModelMapper _mapper;

    public MapperService(ModelMapper _mapper) {
        this._mapper = _mapper;
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
}