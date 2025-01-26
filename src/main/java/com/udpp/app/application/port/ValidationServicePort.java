package com.udpp.app.application.port;

import java.util.List;

import org.springframework.validation.BindingResult;

/// The Validation service.
/// @since 1.0
/// @author Claudiomildo Ventura.
public interface ValidationServicePort {

	/// To get error messages.
	/// @since 1.0
	/// @author Claudiomildo Ventura.
	/// @param bindingResult binding result.
	List<String> getErrorMessages(BindingResult bindingResult);
}