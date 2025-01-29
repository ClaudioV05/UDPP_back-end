package com.udpp.app.application.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import com.udpp.app.application.port.ValidationServicePort;

public class ValidationService implements ValidationServicePort {

	@Override
	public List<String> getErrorMessages(BindingResult bindingResult) {
		List<String> result = new ArrayList<>();

		if (this.existErrorMessages(bindingResult)){
			result = bindingResult.getAllErrors()
					.stream()
					.map(error -> {
						var defaultMessage = error.getDefaultMessage();
						if (error instanceof FieldError) {
							var fieldError = (FieldError) error;
							return String.format("%s %s", fieldError.getField(), defaultMessage);
						} else {
							return defaultMessage;
						}
					})
					.collect(Collectors.toList());
		}

		return result;
	}

	private boolean existErrorMessages(BindingResult bindingResult) {
		return bindingResult.hasErrors();
	}
}