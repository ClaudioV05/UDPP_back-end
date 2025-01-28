package com.udpp.app.application.service;

import com.udpp.app.application.port.ParameterServicePort;
import com.udpp.app.application.port.UnicodeServicePort;
import com.udpp.app.core.constant.ApplicationConst;
import org.springframework.stereotype.Service;

@Service
public class ParameterService implements ParameterServicePort {
	private final UnicodeServicePort _unicodeService;

	public ParameterService(UnicodeServicePort unicodeService) {
		this._unicodeService = unicodeService;
	}

	@Override
	public String getTitle() {
		return _unicodeService.setToUpper(ApplicationConst.TITLE);
	}

	@Override
	public String getDescription() {
		return ApplicationConst.DESCRIPTION;
	}
}