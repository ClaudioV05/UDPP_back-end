package com.udpp.app.adapter.generator.exception.handler;

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
///
/// @author Claudiomildo Ventura.
/// @since 1.0
@RestControllerAdvice
public class UdppExceptionHandler {

    /// To Handle Http Media Type Not Acceptable exception.
    ///
    /// @return ResponseEntity<String>.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @ResponseBody
    @ExceptionHandler(HttpMediaTypeNotAcceptableException.class)
    protected ResponseEntity<String> handleHttpMediaTypeNotAcceptableException() {
        return new ResponseEntity<>("Acceptable MIME type: " + MediaType.APPLICATION_JSON_VALUE, new HttpHeaders(), HttpStatus.NOT_ACCEPTABLE);
    }

    /// To Handle No Resource Found exception.
    ///
    /// @return ResponseEntity<String>.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @ResponseBody
    @ExceptionHandler(NoResourceFoundException.class)
    protected ResponseEntity<String> handleNoResourceFoundException() {
        return new ResponseEntity<>("Method not supported", new HttpHeaders(), HttpStatus.METHOD_NOT_ALLOWED);
    }
}