package com.udpp.app.adapter.inbound.api.controlleradvice;

import com.udpp.app.adapter.inbound.api.dto.MessageErrorDto;
import com.udpp.app.adapter.inbound.api.exceptionhandler.GlobalException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;

/// Unified Development Power Platform - UDPP global exception controller advice.
/// --
///
/// @author Claudiomildo Ventura.
/// @since 1.0
@RestControllerAdvice
public class UdppGlobalExceptionControllerAdvice {

    /// To Handle Http Media Type Not Acceptable exception.
    ///
    /// @return ResponseEntity<String>.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @ResponseBody
    @ExceptionHandler(GlobalException.class)
    protected ResponseEntity<MessageErrorDto> handleHttpMediaTypeNotAcceptableException(GlobalException ex, WebRequest request) {
        MessageErrorDto errorMessage = new MessageErrorDto(HttpStatus.INTERNAL_SERVER_ERROR.value(), new Date(), "Application has a error." /*ex.getMessage()*/, request.getDescription(false));
        // Todo: Put the log here to get {errorMessage} and return a generic error.
        return new ResponseEntity<MessageErrorDto>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}