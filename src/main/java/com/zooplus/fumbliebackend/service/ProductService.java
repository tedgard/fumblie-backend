package com.zooplus.fumbliebackend.service;


import com.zooplus.fumbliebackend.message.product.ProductsResponse;
import com.zooplus.fumbliebackend.model.dto.ProductDto;
import com.zooplus.fumbliebackend.model.entity.Product;
import com.zooplus.fumbliebackend.repo.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepo productRepo;

    @Autowired
    private Converter<Product, ProductDto> productToProductDtoConverter;


    public ProductsResponse getAllProducts(){
        List<Product> products = (List<Product>) productRepo.findAll();
        List<ProductDto> productDtos = new ArrayList<>();

        for(Product product : products)
            productDtos.add(productToProductDtoConverter.convert(product));

        ProductsResponse response = new ProductsResponse();
        response.setProducts(productDtos);

        return response;
    }
}
