package com.InternProjects.e_commerce.cartProduct;

import com.InternProjects.e_commerce.carts.Cart;
import com.InternProjects.e_commerce.product.Product;
import lombok.Data;


@Data
public class CartProductDto {

    private double price;
    private int quantity;
    private Cart cart;
    private Product product;
}
