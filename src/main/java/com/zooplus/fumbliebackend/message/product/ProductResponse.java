package com.zooplus.fumbliebackend.message.product;

import com.zooplus.fumbliebackend.model.dto.ProductDto;
import lombok.Data;

import java.util.List;

/**
 *
 */
@Data
public class ProductResponse {

    List<ProductDto> products;
}
