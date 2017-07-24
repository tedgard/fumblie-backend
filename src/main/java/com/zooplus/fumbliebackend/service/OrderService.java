package com.zooplus.fumbliebackend.service;

import com.zooplus.fumbliebackend.converter.order.AddressDtoToEntityConverter;
import com.zooplus.fumbliebackend.converter.order.OrderToDtoConverter;
import com.zooplus.fumbliebackend.model.dto.OrderDto;
import com.zooplus.fumbliebackend.model.entity.Address;
import com.zooplus.fumbliebackend.model.entity.Order;
import com.zooplus.fumbliebackend.repo.AddressRepository;
import com.zooplus.fumbliebackend.repo.OrderItemRepository;
import com.zooplus.fumbliebackend.repo.OrderRepository;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.transaction.Transactional;

@Service
public class OrderService {
    @Resource
    OrderRepository orderRepository;
    @Resource
    AddressRepository addressRepository;
    @Resource
    OrderItemRepository orderItemRepository;

    @Resource
    OrderToDtoConverter orderToDtoConverter;
    @Resource
    AddressDtoToEntityConverter addressDtoToEntityConverter;

    @Transactional
    public Long placeOrder(OrderDto orderDto) {
        Order order = new Order();

        Address address = addressRepository.save(addressDtoToEntityConverter.convert(orderDto.getAddress()));
        order.setAddress(address);
        order = orderRepository.save(order);

        return null;
    }

    public OrderDto findById(long orderId) {
        return orderToDtoConverter.convert(orderRepository.findOne(orderId));
    }
}
