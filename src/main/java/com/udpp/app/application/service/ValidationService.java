package com.udpp.app.application.service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import com.udpp.app.application.port.ValidationServicePort;

/// The Validation service.
///
/// @since 1.0
/// @author Claudiomildo Ventura.
/// @see
@Service
public class ValidationService implements ValidationServicePort {

	@Override
	public ArrayList<String> getErrorMessages(BindingResult bindingResult) {
		List<String> result = bindingResult.getAllErrors().stream().map(error -> {
			var defaultMessage = error.getDefaultMessage();

			if (error instanceof FieldError) {
				var fieldError = (FieldError) error;
				return String.format("%s %s", fieldError.getField(), defaultMessage);
			} else {
				return defaultMessage;
			}
		}).collect(Collectors.toList());

		return (ArrayList<String>) result;
	}

	@Override
	public Boolean existErrorMessages(BindingResult bindingResult) {
		return bindingResult.hasErrors();
	}
}