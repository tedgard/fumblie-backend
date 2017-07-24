package com.zooplus.fumbliebackend.service;


import com.zooplus.fumbliebackend.message.product.ProductsResponse;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductServiceTest {

    @Autowired
    private ProductService underTest;

    @Test
    public void shouldGetAllProducts() {
        ProductsResponse response = underTest.getAllProducts();
        assertTrue(response.getProducts().size() > 0);
    }

}
