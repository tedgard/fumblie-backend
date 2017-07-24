package com.zooplus.fumbliebackend.controller;

import com.zooplus.fumbliebackend.model.dto.OrderDto;
import com.zooplus.fumbliebackend.service.OrderService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

@RestController
@CrossOrigin
@RequestMapping("/order")
public class OrderController {
    @Resource
    private OrderService orderService;


    @RequestMapping(value = "/order", method = RequestMethod.POST, produces = "application/json")
    public ResponseEntity<?> placeOrder(@RequestBody final OrderDto orderDto) {
        return new ResponseEntity<>(orderService.placeOrder(orderDto), HttpStatus.OK);

    }

}
