package com.InternProjects.e_commerce.order;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OrderMapper {

    OrderMapper Instance= Mappers.getMapper(OrderMapper.class);
    OrderDto toDto(Order order);
    Order toOrder(OrderDto orderDto);
}
