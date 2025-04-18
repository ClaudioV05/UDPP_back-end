package com.udpp.app.adapter.generator.exception.infrastructure;

public class InfrastructureException extends RuntimeException {
    private static final long serialVersionUID = 1L;
    private final String errorCode;

    public InfrastructureException(String errorCode, String errorMessage, Throwable cause) {
        super(errorMessage, cause);
        this.errorCode = errorCode;
    }

    public InfrastructureException(String errorCode, String errorMessage) {
        super(errorMessage);
        this.errorCode = errorCode;
    }

    public String getErrorCode() {
        return errorCode;
    }

    public String getErrorMessage() {
        return this.getMessage();
    }
}