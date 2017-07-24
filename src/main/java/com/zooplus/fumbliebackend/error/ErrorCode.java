package com.zooplus.fumbliebackend.error;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum ErrorCode {

    PRODUCT_NOT_FOUND("FB-001", "Product not found"),
    INVALID_PRODUCT_ID("FB-002", "Invalid product id provided");

    private String code;
    private String reason;

    ErrorCode(String code, String reason) {
        this.code = code;
        this.reason = reason;
    }

    public String toString(String code) {
        StringBuilder result = (new StringBuilder()).append("(").append(this.getCode()).append(")");
        if (this.getReason() != null) {
            result.append(" ").append(this.getReason());
        }
        if (code != null) {
            result.append(": ").append(code);
        }
        return result.toString();
    }
}
