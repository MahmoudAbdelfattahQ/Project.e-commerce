package com.InternProjects.e_commerce.model.dto;

import com.InternProjects.e_commerce.model.entity.Cart;
import com.InternProjects.e_commerce.model.entity.Products;
import jakarta.persistence.*;
import lombok.Data;


@Data
public class CartProductsDto {

    private double price;
    private int quantity;
    private Cart cart;
    private Products product;
}
