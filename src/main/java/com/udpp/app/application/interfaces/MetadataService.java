package com.udpp.app.application.interfaces;

import java.util.List;

import org.springframework.validation.BindingResult;

import com.udpp.app.infrastructure.domain.Table;
import com.udpp.app.presentation.dtos.MetaDataDto;

/**
 * The Metadata service.
 *
 * @since 1.0
 * @author Claudiomildo Ventura.
 * @see
 */
public interface MetadataService {
	String getUDPPSelectParametersInformation();
	List<Table> udppReceiveAndSaveAllTablesAndFieldsOfSchemaDatabase(MetaDataDto metaData, BindingResult bindingResult);
}