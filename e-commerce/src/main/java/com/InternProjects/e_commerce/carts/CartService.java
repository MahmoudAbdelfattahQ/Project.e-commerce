package com.InternProjects.e_commerce.carts;

import com.InternProjects.e_commerce.exceptions.CartNotFoundException;

import java.util.List;

public interface CartService {

    void addCart(CartDto cartDto) throws CartNotFoundException;
    void updateCart(Cart cart);
    void deleteCart(long id);
    Cart getCartByCartId(long id);
    List<Cart> getAllCarts();

}
