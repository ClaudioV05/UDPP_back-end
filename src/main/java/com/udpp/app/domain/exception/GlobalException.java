package com.udpp.app.domain.exception;

public class GlobalException extends RuntimeException {

    public GlobalException() {
        super();
    }

    public GlobalException(String message) {
        super(message);
    }

    public GlobalException(Throwable throwable) {
        super(throwable);
    }

    public GlobalException(String message, Throwable throwable) {
        super(message, throwable);
    }
}