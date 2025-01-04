package com.udpp.app.presentation.globalexceptionhandler;

public class ResponseNullPointerException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ResponseNullPointerException(String message) {
		super(message);
	}
}