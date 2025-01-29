package com.udpp.app.application.port;

import com.udpp.app.adapter.inbound.api.mapper.MetaDataDto;
import com.udpp.app.core.domain.Architecture;
import com.udpp.app.core.domain.Database;
import com.udpp.app.core.domain.DatabaseEngineer;
import com.udpp.app.core.domain.DevelopmentEnvironment;

import java.util.LinkedHashSet;

/// The Mapper service.
/// @since 1.0
/// @author Claudiomildo Ventura.
public interface MapperServicePort {
    ///  Convert to set of architecture.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @param lstArchitecture lstArchitecture.
    /// @return Set of MetaDataDto.
    LinkedHashSet<MetaDataDto> convertToArchitecture(LinkedHashSet<Architecture> lstArchitecture);
    ///  Convert to set of database.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @param lstDatabase lstDatabase.
    /// @return Set of MetaDataDto.
    LinkedHashSet<MetaDataDto> convertToDatabase(LinkedHashSet<Database> lstDatabase);
    ///  Convert to set of database engineer.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @param lstDatabaseEngineer lstDatabaseEngineer.
    /// @return Set of MetaDataDto.
    LinkedHashSet<MetaDataDto> convertToDatabaseEngineer(LinkedHashSet<DatabaseEngineer> lstDatabaseEngineer);
    /// Convert to set of development environment.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @param lstDevelopmentEnvironment lstDevelopmentEnvironment.
    /// @return Set of MetaDataDto.
    LinkedHashSet<MetaDataDto> convertToDevelopmentEnvironment(LinkedHashSet<DevelopmentEnvironment> lstDevelopmentEnvironment);
}