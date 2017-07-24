package com.zooplus.fumbliebackend.error;

import com.zooplus.fumbliebackend.error.exception.InvalidProductIdException;
import com.zooplus.fumbliebackend.error.exception.ProductNotFoundException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.servlet.http.HttpServletRequest;

@ControllerAdvice(basePackages = {"com.zooplus.fumbliebackend.controller"})
@Component
@ResponseBody
@Slf4j
public class ServiceExceptionHandler {

    @ExceptionHandler(ProductNotFoundException.class)
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorInfoMessage processProductNotFoundError(HttpServletRequest request, ProductNotFoundException ex) {

        log.warn(String.format("Request url: %s, HTTP status code: %d, Error message: %s",
                request.getRequestURL().toString(), HttpStatus.NOT_FOUND.value(), ex.getMessage()));

        return ErrorInfoMessage.builder()
                .errorCode(ErrorCode.PRODUCT_NOT_FOUND)
                .url(request.getRequestURL().toString())
                .exception(ex.getMessage())
                .build();
    }

    @ExceptionHandler(InvalidProductIdException.class)
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorInfoMessage processInvalidProductIdError(HttpServletRequest request, InvalidProductIdException ex) {

        log.warn(String.format("Request url: %s, HTTP status code: %d, Error message: %s",
                request.getRequestURL().toString(), HttpStatus.BAD_REQUEST.value(), ex.getMessage()));

        return ErrorInfoMessage.builder()
                .errorCode(ErrorCode.INVALID_PRODUCT_ID)
                .url(request.getRequestURL().toString())
                .exception(ex.getMessage())
                .build();
    }
}
