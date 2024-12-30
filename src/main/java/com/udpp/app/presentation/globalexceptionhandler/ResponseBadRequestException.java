package com.udpp.app.presentation.globalexceptionhandler;

public class ResponseBadRequestException extends RuntimeException {
	
	private static final long serialVersionUID = 1L;
	
    public ResponseBadRequestException(String message) {
        super(message);
    }
}