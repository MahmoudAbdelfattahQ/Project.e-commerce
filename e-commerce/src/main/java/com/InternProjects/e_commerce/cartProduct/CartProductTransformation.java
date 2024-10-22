package com.InternProjects.e_commerce.cartProduct;



public class CartProductTransformation {

    private CartProductTransformation(){}

    public static CartProduct  toCartProduct(CartProductDto cartProductDto){
        return CartProduct.builder()
                .quantity(cartProductDto.getQuantity())
                .cart(cartProductDto.getCart())
                .price(cartProductDto.getPrice())
                .product(cartProductDto.getProduct())
                .build();
    }

}
