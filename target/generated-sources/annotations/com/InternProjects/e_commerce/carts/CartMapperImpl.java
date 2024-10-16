package com.InternProjects.e_commerce.carts;

import com.InternProjects.e_commerce.cartProduct.CartProduct;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-16T21:36:30+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
class CartMapperImpl implements CartMapper {

    @Override
    public CartDto toCartDto(Cart cart) {
        if ( cart == null ) {
            return null;
        }

        CartDto.CartDtoBuilder cartDto = CartDto.builder();

        cartDto.totalPrice( cart.getTotalPrice() );
        cartDto.customerId( cart.getCustomerId() );
        Set<CartProduct> set = cart.getCartProducts();
        if ( set != null ) {
            cartDto.cartProducts( new LinkedHashSet<CartProduct>( set ) );
        }

        return cartDto.build();
    }

    @Override
    public Cart toCart(CartDto cartDto) {
        if ( cartDto == null ) {
            return null;
        }

        Cart.CartBuilder cart = Cart.builder();

        cart.totalPrice( cartDto.getTotalPrice() );
        cart.customerId( cartDto.getCustomerId() );
        Set<CartProduct> set = cartDto.getCartProducts();
        if ( set != null ) {
            cart.cartProducts( new LinkedHashSet<CartProduct>( set ) );
        }

        return cart.build();
    }
}
