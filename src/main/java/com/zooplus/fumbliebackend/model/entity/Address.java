package com.zooplus.fumbliebackend.model.entity;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class Address {
    @Id
    @GeneratedValue
    @Column(name = "address_id")
    private Long id;

    @Column
    private String name;

    @Column
    private String street;

    @Column
    private String city;

    @Column(name = "zip_code")
    private String zipCode;

    @Column
    private String country;
}
