package com.zooplus.fumbliebackend.converter.order;

import com.zooplus.fumbliebackend.model.dto.AddressDto;
import com.zooplus.fumbliebackend.model.dto.OrderDto;
import com.zooplus.fumbliebackend.model.dto.OrderItemDto;
import com.zooplus.fumbliebackend.model.entity.Address;
import com.zooplus.fumbliebackend.model.entity.Order;
import com.zooplus.fumbliebackend.model.entity.OrderItem;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;
import java.util.List;

@Component
public class OrderToDtoConverter implements Converter<Order, OrderDto> {

    @Resource
    OrderItemListToDtoConverter orderItemListToDtoConverter;
    @Resource
    AddressToDtoConverter addressToDtoConverter;

    @Override
    public OrderDto convert(Order order) {
        if (order == null) return null;

        OrderDto dto = new OrderDto();

        dto.setId(order.getId());
        dto.setTotalAmount(order.getTotalAmount());
        dto.setCurrency(order.getCurrency());
        dto.setOrderItems(convertOrderItems(order.getOrderItems()));
        dto.setAddress(convertAddress(order.getAddress()));

        return dto;
    }

    private List<OrderItemDto> convertOrderItems(List<OrderItem> orderItems) {
        return orderItemListToDtoConverter.convert(orderItems);
    }

    private AddressDto convertAddress(Address address) {
        return addressToDtoConverter.convert(address);
    }
}
