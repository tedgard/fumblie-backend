package com.zooplus.fumbliebackend.model.dto;

import lombok.Data;

@Data
public class OrderItemDto {
    private Long id;

    private Long productId;

    private Integer quantity;

}
