package com.InternProjects.e_commerce.model.dto;

import com.InternProjects.e_commerce.model.entity.Cart;
import com.InternProjects.e_commerce.model.entity.Product;
import lombok.Data;


@Data
public class CartProductDto {

    private double price;
    private int quantity;
    private Cart cart;
    private Product product;
}
