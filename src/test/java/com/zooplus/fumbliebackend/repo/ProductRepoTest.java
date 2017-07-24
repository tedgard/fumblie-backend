package com.zooplus.fumbliebackend.repo;

import com.zooplus.fumbliebackend.model.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.assertTrue;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductRepoTest {

    @Autowired
    private ProductRepo productRepo;

    @Test
    public void shouldFindProducts() {
        List<Product> allProducts = (List<Product>) productRepo.findAll();
        assertTrue(allProducts.size() > 0);
    }
}
