package com.InternProjects.e_commerce.cartProduct;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-17T03:25:34+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
public class CartProductMapperImpl implements CartProductMapper {

    @Override
    public CartProduct toCartProduct(CartProductDto cartProductDto) {
        if ( cartProductDto == null ) {
            return null;
        }

        CartProduct cartProduct = new CartProduct();

        cartProduct.setPrice( cartProductDto.getPrice() );
        cartProduct.setQuantity( cartProductDto.getQuantity() );
        cartProduct.setCart( cartProductDto.getCart() );
        cartProduct.setProduct( cartProductDto.getProduct() );

        return cartProduct;
    }

    @Override
    public CartProductDto toCartProductDto(CartProduct cartProduct) {
        if ( cartProduct == null ) {
            return null;
        }

        CartProductDto cartProductDto = new CartProductDto();

        cartProductDto.setPrice( cartProduct.getPrice() );
        cartProductDto.setQuantity( cartProduct.getQuantity() );
        cartProductDto.setCart( cartProduct.getCart() );
        cartProductDto.setProduct( cartProduct.getProduct() );

        return cartProductDto;
    }
}
