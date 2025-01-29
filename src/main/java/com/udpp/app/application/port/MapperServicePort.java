package com.udpp.app.application.port;

import com.udpp.app.adapter.inbound.api.mapper.MetaDataDto;
import com.udpp.app.core.domain.*;

import java.util.LinkedHashSet;

/// The Mapper service.
/// @since 1.0
/// @author Claudiomildo Ventura.
public interface MapperServicePort {
    /// Convert application title.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @param title title.
    /// @return MetaDataDto.
    MetaDataDto getTitle(String title);
    /// Convert application description.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @param description description.
    /// @return MetaDataDto.
    MetaDataDto getDescription(String description);
    ///  Convert to set of architecture.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @param lstArchitecture lstArchitecture.
    /// @return Set of MetaDataDto.
    LinkedHashSet<MetaDataDto> convertLstArchitecture(LinkedHashSet<Architecture> lstArchitecture);
    ///  Convert to set of database.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @param lstDatabase lstDatabase.
    /// @return Set of MetaDataDto.
    LinkedHashSet<MetaDataDto> convertLstDatabase(LinkedHashSet<Database> lstDatabase);
    ///  Convert to set of database engineer.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @param lstDatabaseEngineer lstDatabaseEngineer.
    /// @return Set of MetaDataDto.
    LinkedHashSet<MetaDataDto> convertLstDatabaseEngineer(LinkedHashSet<DatabaseEngineer> lstDatabaseEngineer);
    /// Convert to set of development environment.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @param lstDevelopmentEnvironment lstDevelopmentEnvironment.
    /// @return Set of MetaDataDto.
    LinkedHashSet<MetaDataDto> convertLstDevelopmentEnvironment(LinkedHashSet<DevelopmentEnvironment> lstDevelopmentEnvironment);
    /// Convert to set of form.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @param lstForm lstForm.
    /// @return Set of MetaDataDto.
    LinkedHashSet<MetaDataDto> convertLstForm(LinkedHashSet<Form> lstForm);
}