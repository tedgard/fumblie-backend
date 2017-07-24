package com.zooplus.fumbliebackend.model.entity;

import lombok.Data;
import org.hibernate.annotations.Type;
import org.hibernate.annotations.TypeDef;
import org.hibernate.annotations.TypeDefs;
import org.hibernate.type.CurrencyType;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Currency;
import java.util.List;

@Entity(name = "SHOP_ORDER")
@Data
@TypeDefs({
        @TypeDef(name = "currency", typeClass = CurrencyType.class)
})
public class Order {

    @Id
    @GeneratedValue
    @Column(name = "order_id")
    private Long id;

    @OneToMany(mappedBy = "order", targetEntity = OrderItem.class, fetch = FetchType.EAGER)
    private List<OrderItem> orderItems;

    @Column(name = "total_amount")
    private BigDecimal totalAmount;

    @Column
    @Type(type = "currency")
    private Currency currency;

    @OneToOne(optional = false)
    @JoinColumn(name = "address_id")
    private Address address;


}
