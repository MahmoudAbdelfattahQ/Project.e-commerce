package com.InternProjects.e_commerce.carts;


import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
interface CartMapper {


    CartMapper Instance = Mappers.getMapper(CartMapper.class);

    CartDto toCartDto(Cart cart);

    Cart toCart(CartDto cartDto);
}
