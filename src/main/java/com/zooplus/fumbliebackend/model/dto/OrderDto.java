package com.zooplus.fumbliebackend.model.dto;

import lombok.Data;

import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

@Data
public class OrderDto {
    private Long id;

    private List<OrderItemDto> orderItems;

    private BigDecimal totalAmount;

    private Currency currency;

    private AddressDto address;
}
