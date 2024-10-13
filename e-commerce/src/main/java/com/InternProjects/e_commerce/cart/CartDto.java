package com.InternProjects.e_commerce.cart;

import com.InternProjects.e_commerce.cartProduct.CartProduct;
import lombok.Data;

import java.util.Set;

@Data
public class CartDto {
    private double totalPrice;
    private int customerId;
    private Set<CartProduct> cartProducts ;

}
