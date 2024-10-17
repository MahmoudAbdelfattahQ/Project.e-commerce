package com.InternProjects.e_commerce.cartProduct;

import com.InternProjects.e_commerce.carts.Cart;

import java.util.List;

public interface CartProductService {

    void createCart(CartProductDto cartProductDto);
    void updateCart(CartProduct cartProduct);
    void deleteCart(long id);
    CartProduct getCart(Long id);
    List<CartProduct> getCarts();
}
