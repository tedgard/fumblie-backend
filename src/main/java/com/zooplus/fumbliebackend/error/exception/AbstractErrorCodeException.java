package com.zooplus.fumbliebackend.error.exception;


import com.zooplus.fumbliebackend.error.ErrorCode;

public abstract class AbstractErrorCodeException extends RuntimeException {

    private ErrorCode errorCode;

    protected AbstractErrorCodeException(ErrorCode errorCode, String message) {
        this(errorCode, message, null);
    }

    protected AbstractErrorCodeException(ErrorCode errorCode, String message, Throwable cause) {
        super(errorCode.toString(message), cause);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode() {
        return errorCode;
    }

}
