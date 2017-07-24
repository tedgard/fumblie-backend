package com.zooplus.fumbliebackend.model.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Product {

    @Id
    @GeneratedValue
    private Long id;
    private String title;
    private String description;
    private String image;
    private Double price;
}
