package com.InternProjects.e_commerce.carts;

import com.InternProjects.e_commerce.exceptions.CartDoseExistException;
import com.InternProjects.e_commerce.exceptions.CartNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.InternProjects.e_commerce.carts.CartTransformations.toCart;
import static com.InternProjects.e_commerce.utilits.Updates.updateValues;

@Service
public class CartServiceImpl implements CartService {

    private final CartRepo cartRepo;

    @Autowired
    public CartServiceImpl(CartRepo cartRepo) {
        this.cartRepo = cartRepo;
    }

    @Override
    public void addCart(CartDto cartDto) throws CartDoseExistException {
        Cart cart = toCart(cartDto);
        cartRepo.findByCustomerId(cart.getCustomerId())
                .ifPresent(
                        (cart1)-> { throw new CartDoseExistException();
                        } );
        cartRepo.save(cart);
    }

    @Override
    public void updateCart(Cart cart1) throws CartNotFoundException {
        Cart cart =  cartRepo.findCartByCartId(cart1.getCartId())
                .orElseThrow(CartNotFoundException::new);

        Cart cart2 = (Cart) updateValues(cart1 ,cart);
        cartRepo.save(cart2);

    }

    @Override
    public void deleteCart(long id) {
        cartRepo.findCartByCartId(id)
                .ifPresentOrElse(cartRepo::delete,CartNotFoundException::new);

    }

    @Override
    public Cart getCartByCartId(long id) {
        return cartRepo.findCartByCartId(id).orElseThrow(CartNotFoundException::new);
    }

    @Override
    public List<Cart> getAllCarts() {
        return cartRepo.findAll();
    }
}
