package com.InternProjects.e_commerce.customer;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CustomerMapper {

    CustomerMapper Instance = Mappers.getMapper(CustomerMapper.class);
    Customer toCustomer(CustomerDto CustomerDto);
    CustomerDto ToCustomerDto(Customer Customer);
}
