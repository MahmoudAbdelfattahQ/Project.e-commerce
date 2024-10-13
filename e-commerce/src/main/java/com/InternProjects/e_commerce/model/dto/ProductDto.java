package com.InternProjects.e_commerce.model.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class ProductDto {

    private String  title;
    private String  description;
    private Double  price;
    private String  brand;
    private String  category;
    private Double  weight;
    private Boolean  isAvailable;
}
