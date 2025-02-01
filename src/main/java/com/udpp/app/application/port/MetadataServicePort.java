package com.udpp.app.application.port;

import com.udpp.app.adapter.inbound.api.mapper.Embedded;
import com.udpp.app.adapter.inbound.api.mapper.MetaDataDto;
import com.udpp.app.adapter.inbound.api.dto.MetaTableDto;
import org.springframework.validation.BindingResult;

import java.util.LinkedHashSet;
import java.util.List;

/// The Metadata service.
/// @since 1.0
/// @author Claudiomildo Ventura.
public interface MetadataServicePort {
	/// Generate MetaData.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @param metadata metadata.
	/// @param bindingResult binding result.
	/// @return List<MetaDataDto>
	List<com.udpp.app.adapter.inbound.api.mapper.MetaDataDto> generateMetaData(com.udpp.app.adapter.inbound.api.dto.MetaDataDto metadata, BindingResult bindingResult);
	/// Generate MetaTable.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @param metatable metatable.
	/// @return List<MetaTableDto>
	List<MetaTableDto> generateMetaTable(com.udpp.app.adapter.inbound.api.dto.MetaTableDto metatable);
	/// To get the application title.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return Embedded.
	Embedded getTitle();
	/// To get the application description.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return Embedded.
	Embedded getDescription();
	/// To get enum architectures data.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return Set of Embedded.
	LinkedHashSet<Embedded> getArchitectureData();
	/// To get enum database data.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return Set of Embedded.
	LinkedHashSet<com.udpp.app.adapter.inbound.api.mapper.Embedded> getDatabasesData();
	/// To get enum database engineer data.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return Set of Embedded.
	LinkedHashSet<com.udpp.app.adapter.inbound.api.mapper.Embedded> getDatabasesEngineerData();
	/// To get enum development environment data.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return Set of Embedded.
	LinkedHashSet<com.udpp.app.adapter.inbound.api.mapper.Embedded> getDevelopmentEnvironmentData();
	/// To get enum form data.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return Set of Embedded.
	LinkedHashSet<com.udpp.app.adapter.inbound.api.mapper.Embedded> getFormData();
}