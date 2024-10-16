package com.InternProjects.e_commerce.carts;

import com.InternProjects.e_commerce.cartProduct.CartProduct;
import jakarta.validation.constraints.NotEmpty;
import lombok.Builder;
import lombok.Data;

import java.util.Set;

@Data
@Builder
public class CartDto {

    @NotEmpty
    private double totalPrice;
    @NotEmpty
    private int customerId;

    private Set<CartProduct> cartProducts ;

}
