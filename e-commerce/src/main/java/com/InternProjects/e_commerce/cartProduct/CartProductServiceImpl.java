package com.InternProjects.e_commerce.cartProduct;

import com.InternProjects.e_commerce.carts.Cart;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CartProductServiceImpl implements CartProductService {

    private final CartProductRepo cartProductRepo;
    public CartProductServiceImpl(CartProductRepo cartProductRepo) {
        this.cartProductRepo = cartProductRepo;
    }
    @Override
    public void createCart(CartProductDto cartProductDto) {
    CartProduct cartProduct = CartProductMapper.Instance.toCartProduct(cartProductDto);
        cartProductRepo.save(cartProduct);
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
