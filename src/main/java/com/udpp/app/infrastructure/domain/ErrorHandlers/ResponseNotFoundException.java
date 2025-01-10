package com.udpp.app.infrastructure.domain.ErrorHandlers;

public class ResponseNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResponseNotFoundException(String message) {
		super(message);
	}
}