package com.udpp.app.adapter.generator.exception.handler;

import com.udpp.app.adapter.generator.input.dto.MessageErrorDto;
import com.udpp.app.domain.exception.GlobalException;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;

import java.util.Date;
import java.util.logging.*;

/// Unified Development Power Platform - UDPP global exception controller advice.
/// --
///
/// @author Claudiomildo Ventura.
/// @since 1.0
@RestControllerAdvice
public class UdppGlobalExceptionHandler {

    private static Logger logger = Logger.getLogger(UdppGlobalExceptionHandler.class.getName());

    /// To Handle Http Media Type Not Acceptable exception.
    ///
    /// @return ResponseEntity<String>.
    /// @author Claudiomildo Ventura.
    /// @since 1.0
    @ResponseBody
    @ExceptionHandler(GlobalException.class)
    protected ResponseEntity<MessageErrorDto> handleHttpMediaTypeNotAcceptableException(GlobalException ex, WebRequest request) {
        MessageErrorDto errorMessage = new MessageErrorDto(HttpStatus.INTERNAL_SERVER_ERROR.value(), new Date(), ex.getMessage(), request.getDescription(false));
        logger.log(Level.WARNING, ex.getMessage());
        return new ResponseEntity<MessageErrorDto>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}