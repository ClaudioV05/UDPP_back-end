package com.udpp.app.application.service;

import com.udpp.app.adapter.inbound.api.dto.MetaDataDto;
import com.udpp.app.adapter.inbound.api.dto.MetaTableDto;
import com.udpp.app.adapter.inbound.api.exceptionhandler.GlobalException;
import com.udpp.app.application.port.ArchitectureServicePort;
import com.udpp.app.application.port.ParameterServicePort;
import com.udpp.app.core.constant.Architecture;
import org.springframework.beans.factory.annotation.Autowired;

import com.udpp.app.application.port.MetadataServicePort;
import com.udpp.app.application.port.ValidationServicePort;
import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;

import java.util.List;

@Service
public class MetadataService implements MetadataServicePort {

	private final ArchitectureServicePort _architectureServicePort;
	private final ParameterServicePort _parameterServicePort;
	private final ValidationServicePort _validationServicePort;

	@Autowired
	MetadataService(ArchitectureService architectureService,
					ParameterServicePort parameterServicePort,
					ValidationServicePort validationServicePort) {
		_architectureServicePort = architectureService;
		_parameterServicePort = parameterServicePort;
		_validationServicePort = validationServicePort;
	}

	@Override
	public List<MetaDataDto> generateMetaData(MetaDataDto metadata, BindingResult bindingResult) {
		try {
			var result = _validationServicePort.getErrorMessages(bindingResult);

			if (!result.isEmpty()){
				throw new GlobalException(result.toString());
			}
			// continue here.

			return null;
		} catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public List<MetaTableDto> generateMetaTable(MetaTableDto metatable) {
		try {
			throw new UnsupportedOperationException("Not implemented.");
		} catch (Exception ex) {
			throw new GlobalException(ex.getMessage());
		}
	}

	@Override
	public String getTitle() {
		return _parameterServicePort.getTitle();
	}

	@Override
	public String getDescription() {
		return _parameterServicePort.getDescription();
	}

	@Override
	public List<Architecture> getArchitecturesDescription() {
	return _architectureServicePort.getArchitecturesDescription();
	}
}