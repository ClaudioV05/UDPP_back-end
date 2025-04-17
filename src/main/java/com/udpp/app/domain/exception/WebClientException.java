package com.udpp.app.domain.exception;

import java.io.Serial;

public class WebClientException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public WebClientException(String message) {
        super(message);
    }

    public WebClientException(String message, Throwable throwable) {
        super(message, throwable);
    }
}