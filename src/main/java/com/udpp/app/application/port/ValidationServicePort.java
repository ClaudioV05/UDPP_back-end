package com.udpp.app.application.port;

import java.util.ArrayList;

import org.springframework.validation.BindingResult;

/// The Web service.
/// @since 1.0
/// @author Claudiomildo Ventura.
/// @see
public interface ValidationServicePort {
	ArrayList<String> getErrorMessages(BindingResult bindingResult);
	Boolean existErrorMessages(BindingResult bindingResult);
}