package com.zooplus.fumbliebackend.service;

import com.zooplus.fumbliebackend.converter.order.OrderToOrderDtoConverter;
import com.zooplus.fumbliebackend.model.dto.OrderDto;
import com.zooplus.fumbliebackend.repo.OrderRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderService {
    @Resource
    OrderRepository orderRepository;
    @Resource
    OrderToOrderDtoConverter orderToOrderDtoConverter;

    public Long placeOrder(OrderDto order) {
        return null;
    }

    public OrderDto findById(long orderId) {
        return orderToOrderDtoConverter.convert(orderRepository.findOne(orderId));
    }
}
