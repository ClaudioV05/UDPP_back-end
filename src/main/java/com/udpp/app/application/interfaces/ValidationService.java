package com.udpp.app.application.interfaces;

import java.util.List;

import org.springframework.validation.BindingResult;

/**
 * The Web service.
 *
 * @since 1.0
 * @author Claudiomildo Ventura.
 * @see
 */
public interface ValidationService {
	List<String> getErrorMessages(BindingResult bindingResult);
	Boolean existErrorMessages(BindingResult bindingResult);
}