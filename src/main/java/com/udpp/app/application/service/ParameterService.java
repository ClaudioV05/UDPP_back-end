package com.udpp.app.application.service;

import com.udpp.app.application.port.ParameterServicePort;
import com.udpp.app.core.constant.ParameterSolution;
import org.springframework.stereotype.Service;

@Service
public class ParameterService implements ParameterServicePort {

	@Override
	public String getSolutionTitle() {
		return ParameterSolution.TITLE.toUpperCase();
	}
}