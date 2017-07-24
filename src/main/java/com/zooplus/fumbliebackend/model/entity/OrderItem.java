package com.zooplus.fumbliebackend.model.entity;

import lombok.Data;

import javax.persistence.*;

@Entity(name = "ORDER_ITEM")
@Data
public class OrderItem {
    @Id
    @GeneratedValue
    @Column(name = "order_item_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "order_id",referencedColumnName = "order_id")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id",referencedColumnName = "product_id")
    private Product product;

    @Column
    private Integer quantity;
}
