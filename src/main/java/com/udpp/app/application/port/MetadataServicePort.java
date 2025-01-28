package com.udpp.app.application.port;

import com.udpp.app.adapter.inbound.api.dto.MetaDataDto;
import com.udpp.app.adapter.inbound.api.dto.MetaTableDto;
import com.udpp.app.core.domain.Architecture;
import org.springframework.validation.BindingResult;

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
	/// @return String.
	String getTitle();
	/// To get the application description.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return String.
	String getDescription();
	/// To get enum architectures description.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @return List of Architecture.
	List<Architecture> getArchitecturesDescription();
}