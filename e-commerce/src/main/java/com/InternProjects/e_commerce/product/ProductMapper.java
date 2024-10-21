package com.InternProjects.e_commerce.product;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ProductMapper {

    ProductMapper Instance = Mappers.getMapper(ProductMapper.class);

    Product mappToProduct(ProductDto productDto);
    ProductDto mappToProductDto(Product product);
}
