package com.udpp.app.domain.exception;

import java.io.Serial;

public class NotAuthorizedException extends RuntimeException {
    @Serial
    private static final long serialVersionUID = 1L;

    public NotAuthorizedException(String message) {
        super(message);
    }

    public NotAuthorizedException(String message, Throwable throwable) {
        super(message, throwable);
    }
}