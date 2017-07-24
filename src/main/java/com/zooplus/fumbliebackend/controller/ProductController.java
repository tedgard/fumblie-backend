package com.zooplus.fumbliebackend.controller;

import com.zooplus.fumbliebackend.message.product.ProductResponse;
import com.zooplus.fumbliebackend.message.product.ProductsResponse;
import com.zooplus.fumbliebackend.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import javax.annotation.Resource;

@Controller
@Slf4j
public class ProductController {

    @Resource
    private ProductService productService;

    @RequestMapping(value = "/products", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ProductsResponse getAllProducts() {
        log.info("Calling getAllProducts");
        return productService.getAllProducts();
    }

    @RequestMapping(value = "/products/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public ProductResponse getProductById(@PathVariable("id") String productId) {
        log.info("Calling getProductById : "+productId);
        return productService.getProductById(productId);
    }
}
