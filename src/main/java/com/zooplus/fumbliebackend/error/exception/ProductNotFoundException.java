package com.zooplus.fumbliebackend.error.exception;

import com.zooplus.fumbliebackend.error.ErrorCode;

public class ProductNotFoundException extends AbstractErrorCodeException {
    public ProductNotFoundException(String productId) {
        super(ErrorCode.PRODUCT_NOT_FOUND, String.format("Product ID: %s", productId));
    }
}
