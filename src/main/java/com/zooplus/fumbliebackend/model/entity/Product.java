package com.zooplus.fumbliebackend.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue
    @Column(name = "product_id")
    private Long id;
    private String title;
    private String description;
    private String image;
    private Double price;
}
