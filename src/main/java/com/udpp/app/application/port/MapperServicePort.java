package com.udpp.app.application.port;

import com.udpp.app.adapter.inbound.api.mapper.MetaDataDto;
import com.udpp.app.core.domain.DevelopmentEnvironment;

import java.util.LinkedHashSet;

/// The Mapper service.
/// @since 1.0
/// @author Claudiomildo Ventura.
public interface MapperServicePort {
    /// Convert to set.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @param lstDevelopmentEnvironment lstDevelopmentEnvironment.
    /// @return Set of MetaDataDto.
    LinkedHashSet<MetaDataDto> convert(LinkedHashSet<DevelopmentEnvironment> lstDevelopmentEnvironment);
}