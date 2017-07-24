package com.zooplus.fumbliebackend.converter.order;

import com.zooplus.fumbliebackend.model.dto.OrderItemDto;
import com.zooplus.fumbliebackend.model.entity.OrderItem;
import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@Component
public class OrderItemListToDtoConverter implements Converter<List<OrderItem>, List<OrderItemDto>> {

    @Resource
    OrderItemToDtoConverter converter;

    @Override
    public List<OrderItemDto> convert(List<OrderItem> orderItemList) {
        if (CollectionUtils.isEmpty(orderItemList)) return null;


        List<OrderItemDto> dtoList = new ArrayList<>();

        for (OrderItem item : orderItemList) {
            dtoList.add(converter.convert(item));
        }

        return dtoList;
    }
}
