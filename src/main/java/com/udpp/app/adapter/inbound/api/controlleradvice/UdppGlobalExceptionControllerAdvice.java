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

@RestControllerAdvice
public class UdppGlobalExceptionControllerAdvice {

    @ResponseBody
    @ExceptionHandler(GlobalException.class)
    protected ResponseEntity<MessageErrorDto> handleHttpMediaTypeNotAcceptableException(GlobalException ex, WebRequest request) {
        MessageErrorDto errorMessage = new MessageErrorDto(HttpStatus.INTERNAL_SERVER_ERROR.value(), new Date(), ex.getMessage(),request.getDescription(false));
        return new ResponseEntity<MessageErrorDto>(errorMessage, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}