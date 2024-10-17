package com.InternProjects.e_commerce.cartProduct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CartProductMapper {

    CartProductMapper  Instance = Mappers.getMapper(CartProductMapper.class);
    CartProduct toCartProduct(CartProductDto cartProductDto);
    CartProductDto toCartProductDto(CartProduct cartProduct);
}
