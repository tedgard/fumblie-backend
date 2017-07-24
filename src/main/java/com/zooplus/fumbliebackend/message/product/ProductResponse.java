package com.zooplus.fumbliebackend.message.product;

import com.zooplus.fumbliebackend.model.dto.ProductDto;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ProductResponse {

    ProductDto product;
}
