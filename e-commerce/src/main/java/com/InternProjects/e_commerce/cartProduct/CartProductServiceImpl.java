package com.InternProjects.e_commerce.cartProduct;

import com.InternProjects.e_commerce.carts.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.InternProjects.e_commerce.cartProduct.CartProductTransformation.toCartProduct;


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
    public void updateCart(CartProduct cartProduct) {
        if(cartProductRepo.existsById(cartProduct.getId())){
            cartProductRepo.save(cartProduct);
        }
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
