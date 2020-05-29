package com.example.dyupdate.exception;

public enum ErrorCode {

    SUCCESS(200,1),
    BAD_PARAM(200, 20001),

    BAD_REQUEST(400, 400),
    UNAUTHORIZED(401, 401),
    NO_TOKEN(401, 40101),
    FORBIDDEN(403, 403),

    INTERNAL_SERVER_ERROR(500, 500);


    private int httpStatus;
    private int code;

    ErrorCode(int httpStatus, int code) {
        this.httpStatus = httpStatus;
        this.code = code;
    }

    public int getHttpStatus() {
        return httpStatus;
    }

    public int getCode() {
        return code;
    }
}
