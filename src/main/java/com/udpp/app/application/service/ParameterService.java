package com.udpp.app.application.service;

import com.udpp.app.application.port.ParameterServicePort;
import com.udpp.app.application.port.UnicodeServicePort;
import com.udpp.app.core.constant.ApplicationConst;
import com.udpp.app.core.domain.Metadata;

public class ParameterService implements ParameterServicePort {
	private final UnicodeServicePort _unicodeService;

	public ParameterService(UnicodeServicePort unicodeService) {
		this._unicodeService = unicodeService;
	}

	@Override
	public Metadata getTitle() {
		return new Metadata(0, (_unicodeService.setToUpper(ApplicationConst.TITLE)));
	}

	@Override
	public Metadata getDescription() {
		return new Metadata(0, ApplicationConst.DESCRIPTION);
	}
}