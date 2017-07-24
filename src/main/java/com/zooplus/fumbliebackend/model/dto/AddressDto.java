package com.zooplus.fumbliebackend.model.dto;

import lombok.Data;

@Data
public class AddressDto {
    private Long id;

    private String name;

    private String street;

    private String city;

    private String zipCode;

    private String country;

}
