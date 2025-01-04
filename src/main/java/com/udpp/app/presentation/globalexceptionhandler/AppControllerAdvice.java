package com.udpp.app.presentation.globalexceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
public class AppControllerAdvice {

	@ExceptionHandler(Throwable.class)
	public ResponseEntity<String> handleThrowableGeneralException(final Throwable ex) {
		return this.entityResult(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE);
	}

	@ExceptionHandler({ ResponseNotFoundException.class })
	public ResponseEntity<String> handleResponseNotFoundException(final ResponseNotFoundException ex) {
		return this.entityResult(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler({ ResponseBadRequestException.class })
	public ResponseEntity<String> handleResponseBadRequestException(final ResponseBadRequestException ex) {
		return this.entityResult(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}

	@ExceptionHandler({ ResponseNullPointerException.class })
	public ResponseEntity<String> handleNullPointerException(final ResponseNullPointerException ex) {
		return this.entityResult(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}

	private final ResponseEntity<String> entityResult(String message, HttpStatus statusCode) {
		String messageFormated = String.format("{\n\t statusCode: %s, \n\t exceptionOccurred: %S  \n}",
				statusCode.toString().toLowerCase(), message);
		return new ResponseEntity<>(messageFormated, statusCode);
	}
}