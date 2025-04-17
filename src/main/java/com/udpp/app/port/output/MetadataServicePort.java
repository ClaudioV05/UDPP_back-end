package com.udpp.app.port.output;

import com.udpp.app.adapter.input.dto.MetaTableDto;
import com.udpp.app.adapter.input.mapper.Embedded;
import com.udpp.app.adapter.input.mapper.MetaDataDto;
import org.springframework.validation.BindingResult;

import java.util.LinkedHashSet;
import java.util.List;

/// The Metadata service.
///
/// @author Claudiomildo Ventura.
/// @since 1.0
public interface MetadataServicePort {
    /// Generate MetaData.
    ///
    /// @param metadata      metadata.
    /// @param bindingResult binding result.
    /// @return List<MetaDataDto>
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    List<MetaDataDto> generateMetaData(List<com.udpp.app.adapter.input.dto.MetaDataDto> lstMetadata, BindingResult bindingResult);

    /// Generate MetaTable.
    ///
    /// @param metatable metatable.
    /// @return List<MetaTableDto>
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    List<MetaTableDto> generateMetaTable(List<MetaTableDto> lstMetatable);

    /// To get the application title.
    ///
    /// @return Embedded.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    Embedded getTitle();

    /// To get the application description.
    ///
    /// @return Embedded.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    Embedded getDescription();

    /// To get enum architectures data.
    ///
    /// @return Set of Embedded.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    LinkedHashSet<Embedded> getArchitectureData();

    /// To get enum database data.
    ///
    /// @return Set of Embedded.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    LinkedHashSet<Embedded> getDatabasesData();

    /// To get enum database engineer data.
    ///
    /// @return Set of Embedded.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    LinkedHashSet<Embedded> getDatabasesEngineerData();

    /// To get enum development environment data.
    ///
    /// @return Set of Embedded.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    LinkedHashSet<Embedded> getDevelopmentEnvironmentData();

    /// To get enum form data.
    ///
    /// @return Set of Embedded.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    LinkedHashSet<Embedded> getFormData();
}