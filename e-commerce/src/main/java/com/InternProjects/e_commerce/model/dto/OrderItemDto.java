package com.InternProjects.e_commerce.model.dto;

import com.InternProjects.e_commerce.model.entity.Products;
import lombok.Data;

@Data
public class OrderItemDto {

    private int quantity;
    private double itemPrice;
    private OrdersDto order;
    private Products product;

}
