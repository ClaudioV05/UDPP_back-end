package com.udpp.app.application.port;

import com.udpp.app.adapter.inbound.api.mapper.MetaDataDto;
import com.udpp.app.adapter.inbound.api.dto.MetaTableDto;
import com.udpp.app.core.domain.Architecture;
import com.udpp.app.core.domain.Database;
import com.udpp.app.core.domain.DatabaseEngineer;
import com.udpp.app.core.domain.DevelopmentEnvironment;
import org.springframework.validation.BindingResult;

import java.util.HashSet;
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
	List<MetaDataDto> generateMetaData(MetaDataDto metadata, BindingResult bindingResult);
	/// Generate MetaTable.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @param metatable metatable.
	/// @return List<MetaTableDto>
	List<MetaTableDto> generateMetaTable(MetaTableDto metatable);
	/// To get the application title.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return MetaDataDto.
	MetaDataDto getTitle();
	/// To get the application description.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return MetaDataDto.
	MetaDataDto getDescription();
	/// To get enum architectures description.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return List of Architecture.
	LinkedHashSet<Architecture> getArchitecturesDescription();
	/// To get enum database description.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return List of Database.
	List<Database> getDatabasesDescription();
	/// To get enum database engineer description.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return List of Database engineer.
	List<DatabaseEngineer> getDatabasesEngineerDescription();
	/// To get enum development environment description.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return List of Development environment.
	List<DevelopmentEnvironment> getDevelopmentEnvironmentDescription();
}