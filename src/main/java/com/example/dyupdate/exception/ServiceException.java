package com.example.dyupdate.exception;

public class ServiceException extends RuntimeException {

    private ErrorCode code;

    public ServiceException(String message, ErrorCode code) {
        super(message);
        this.code = code;
    }

    public ErrorCode getCode() {
        return code;
    }
}
