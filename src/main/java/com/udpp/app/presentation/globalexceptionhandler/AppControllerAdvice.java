package com.udpp.app.presentation.globalexceptionhandler;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice(annotations = RestController.class)
public class AppControllerAdvice {

	@ExceptionHandler(Throwable.class)
	public ResponseEntity<String> handleThrowableGeneralException(final Throwable ex) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_ACCEPTABLE);
	}

	@ExceptionHandler({ ResponseNotFoundException.class })
	public ResponseEntity<String> handleResponseNotFoundException(final ResponseNotFoundException ex) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}

	@ExceptionHandler({ ResponseBadRequestException.class })
	public ResponseEntity<String> handleResponseBadRequestException(final ResponseBadRequestException ex) {
		return new ResponseEntity<>(ex.getMessage(), HttpStatus.BAD_REQUEST);
	}
}