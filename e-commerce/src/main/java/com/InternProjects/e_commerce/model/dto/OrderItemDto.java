package com.InternProjects.e_commerce.model.dto;

import com.InternProjects.e_commerce.model.entity.Product;
import lombok.Data;

@Data
public class OrderItemDto {

    private int quantity;
    private double itemPrice;
    private OrderDto order;
    private Product product;

}
