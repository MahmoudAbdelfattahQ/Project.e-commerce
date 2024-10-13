package com.InternProjects.e_commerce.model.dto;

import com.InternProjects.e_commerce.model.entity.CartProduct;
import lombok.Data;

import java.util.Set;

@Data
public class CartDto {
    private double totalPrice;
    private int customerId;
    private Set<CartProduct> cartProducts ;

}
