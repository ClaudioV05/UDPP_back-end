package com.udpp.app.adapter.inbound.api.controlleradvice;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.HttpMediaTypeNotAcceptableException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.resource.NoResourceFoundException;

/// Unified Development Power Platform - UDPP controller advice.
/// --
/// @since 1.0
/// @author Claudiomildo Ventura.
@RestControllerAdvice
public class UdppExceptionControllerAdvice {

    /// To Handle Http Media Type Not Acceptable exception.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @return ResponseEntity<String>.
    @ResponseBody
    @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
    protected ResponseEntity<String> handleHttpMediaTypeNotAcceptableException() {
        return new ResponseEntity<>("Acceptable MIME type: " + MediaType.APPLICATION_JSON_VALUE, new HttpHeaders(), HttpStatus.NOT_ACCEPTABLE);
    }

    /// To Handle No Resource Found exception.
    /// @since 1.0
    /// @author Claudiomildo Ventura.
    /// @return ResponseEntity<String>.
    @ResponseBody
    @ExceptionHandler(NoResourceFoundException.class)
    protected ResponseEntity<String> handleNoResourceFoundException() {
        return new ResponseEntity<>("Method not supported",new HttpHeaders(), HttpStatus.METHOD_NOT_ALLOWED);
    }
}