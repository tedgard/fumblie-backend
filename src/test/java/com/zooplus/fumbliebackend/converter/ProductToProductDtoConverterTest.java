package com.zooplus.fumbliebackend.converter;


import com.zooplus.fumbliebackend.model.dto.ProductDto;
import com.zooplus.fumbliebackend.model.entity.Product;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.convert.converter.Converter;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductToProductDtoConverterTest {

    public static final String PRODUCT_TITLE = "product title";
    public static final String PRODUCT_DESCRIPTION = "product description";
    public static final String PRODUCT_LINK_IMAGE = "product link image";
    public static final double PRODUCT_PRICE = 10.99;
    public static final long PRODUCT_ID = 1L;

    @Resource
    private Converter<Product, ProductDto>  underTest;

    @Test
    public void shouldReturnNull() {
        ProductDto result = underTest.convert(null);
        assertNull(result);
    }

    @Test
    public void shouldConvertProductToProductDto() {
        Product product = prepareProduct();
        ProductDto productDto = prepareProductDto();

        ProductDto result = underTest.convert(product);

        assertEquals(productDto, result);
    }

    private Product prepareProduct() {
        Product product = new Product();
        product.setId(1L);
        product.setTitle(PRODUCT_TITLE);
        product.setDescription(PRODUCT_DESCRIPTION);
        product.setImage(PRODUCT_LINK_IMAGE);
        product.setPrice(PRODUCT_PRICE);
        return product;
    }

    private ProductDto prepareProductDto() {
        ProductDto productDto = new ProductDto();
        productDto.setId(PRODUCT_ID);
        productDto.setTitle(PRODUCT_TITLE);
        productDto.setDescription(PRODUCT_DESCRIPTION);
        productDto.setImage(PRODUCT_LINK_IMAGE);
        productDto.setPrice(PRODUCT_PRICE);
        return productDto;
    }

}
