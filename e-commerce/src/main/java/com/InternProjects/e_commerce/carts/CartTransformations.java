package com.InternProjects.e_commerce.carts;





public class CartTransformations {

private CartTransformations(){}

    public static  Cart  toCart(CartDto cartDto){
    return Cart.builder()
            .totalPrice(cartDto.getTotalPrice())
            .customerId(cartDto.getCustomerId())
            .cartProducts(cartDto.getCartProducts())
            .build();
    }
}
