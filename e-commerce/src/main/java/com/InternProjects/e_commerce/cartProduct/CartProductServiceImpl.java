package com.InternProjects.e_commerce.cartProduct;

import org.springframework.stereotype.Service;

import java.util.List;

import static com.InternProjects.e_commerce.cartProduct.CartProductTransformation.toCartProduct;
import static com.InternProjects.e_commerce.utilits.Updates.updateValues;


@Service
public class CartProductServiceImpl implements CartProductService {

    private final CartProductRepo cartProductRepo;
    public CartProductServiceImpl(CartProductRepo cartProductRepo) {
        this.cartProductRepo = cartProductRepo;
    }
    @Override
    public void createCart(CartProductDto cartProductDto) {
        cartProductRepo.save(toCartProduct(cartProductDto));
    }

    @Override
    public void updateCart(CartProduct newCartProduct) {
        CartProduct exitingCartProduct = cartProductRepo.findById(newCartProduct.getId());
        cartProductRepo.save( updateValues(newCartProduct, exitingCartProduct));

    }

    @Override
    public void deleteCart(long id) {
        cartProductRepo.deleteById(id);

    }


    @Override
    public CartProduct getCart(Long id) {
        return cartProductRepo.findById(id);
    }

    @Override
    public List<CartProduct> getCarts() {
        return cartProductRepo.findAll();
    }
}
