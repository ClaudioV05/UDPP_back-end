package com.udpp.app.application.service;

import com.udpp.app.application.port.ParameterServicePort;
import com.udpp.app.core.constant.ApplicationParameter;
import org.springframework.stereotype.Service;

@Service
public class ParameterService implements ParameterServicePort {

	@Override
	public String getTitle() {
		return ApplicationParameter.TITLE.toUpperCase();
	}

	@Override
	public String getDescription() {
		return ApplicationParameter.DESCRIPTION;
	}
}