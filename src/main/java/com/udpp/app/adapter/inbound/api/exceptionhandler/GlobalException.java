package com.udpp.app.adapter.inbound.api.exceptionhandler;

public class GlobalException extends RuntimeException {

    public GlobalException() {
        super();
    }

    public GlobalException(String message) {
        super(message);
    }

    public GlobalException(Throwable cause) {
        super(cause);
    }

    public GlobalException(String message, Throwable cause) {
        super(message, cause);
    }
}