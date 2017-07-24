package com.zooplus.fumbliebackend.service;

import com.zooplus.fumbliebackend.model.dto.OrderDto;
import com.zooplus.fumbliebackend.repo.OrderRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class OrderService {
    @Resource
    OrderRepository orderRepository;

    public Long placeOrder(OrderDto order) {
        return null;
    }
}
