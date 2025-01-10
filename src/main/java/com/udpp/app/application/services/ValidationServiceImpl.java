package com.udpp.app.application.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;

import com.udpp.app.application.interfaces.ValidationService;

@Service
public class ValidationServiceImpl implements ValidationService {

	@Override
	public List<String> getErrorMessages(BindingResult bindingResult) {
		List<String> result = bindingResult.getAllErrors().stream().map(error -> {
			var defaultMessage = error.getDefaultMessage();

			if (error instanceof FieldError) {
				var fieldError = (FieldError) error;
				return String.format("%s %s", fieldError.getField(), defaultMessage);
			} else {
				return defaultMessage;
			}
		}).collect(Collectors.toList());

		return result;
	}

	@Override
	public Boolean existErrorMessages(BindingResult bindingResult) {
		return bindingResult.hasErrors();
	}
}