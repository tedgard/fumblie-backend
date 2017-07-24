package com.zooplus.fumbliebackend.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ProductDto {

    private Long id;
    private String title;
    private String description;
    private String image;
    private Double price;
}
