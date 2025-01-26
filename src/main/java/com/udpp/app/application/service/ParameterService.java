package com.udpp.app.application.service;

import com.udpp.app.application.port.ParameterServicePort;
import com.udpp.app.core.constant.ApplicationParameter;
import org.springframework.stereotype.Service;

@Service
public class ParameterService implements ParameterServicePort {

	@Override
	public String getSolutionTitle() {
		return ApplicationParameter.TITLE.toUpperCase();
	}
}