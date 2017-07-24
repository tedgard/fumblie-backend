package com.zooplus.fumbliebackend.error.exception;

import com.zooplus.fumbliebackend.error.ErrorCode;

public class InvalidProductIdException extends AbstractErrorCodeException {
    public InvalidProductIdException(String productId) {
        super(ErrorCode.INVALID_PRODUCT_ID, productId);
    }
}
