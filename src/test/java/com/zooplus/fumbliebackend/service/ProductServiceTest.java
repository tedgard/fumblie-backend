package com.zooplus.fumbliebackend.service;


import com.zooplus.fumbliebackend.error.exception.InvalidProductIdException;
import com.zooplus.fumbliebackend.error.exception.ProductNotFoundException;
import com.zooplus.fumbliebackend.message.product.ProductResponse;
import com.zooplus.fumbliebackend.message.product.ProductsResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

    @Resource
    private ProductService underTest;

    @Test
    public void shouldGetAllProducts() {
        ProductsResponse response = underTest.getAllProducts();
        assertTrue(response.getProducts().size() > 0);
    }

    @Test
    public void shouldRetrieveAnExistingProduct() {
        ProductResponse response = underTest.getProductById("1");

        assertTrue(response.getProduct() != null);
        assertTrue(response.getProduct().getId() > 0);
    }

    @Test(expected = InvalidProductIdException.class)
    public void shouldThrowInvalidProductIdException() {
        underTest.getProductById("string");
    }

    @Test(expected = ProductNotFoundException.class)
    public void shouldThrowProductNotFoundException() {
        underTest.getProductById("99999");
    }

}
