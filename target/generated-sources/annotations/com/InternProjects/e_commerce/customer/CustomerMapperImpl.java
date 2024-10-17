package com.InternProjects.e_commerce.customer;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-17T03:25:35+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
public class CustomerMapperImpl implements CustomerMapper {

    @Override
    public Customer toCustomer(CustomerDto CustomerDto) {
        if ( CustomerDto == null ) {
            return null;
        }

        Customer.CustomerBuilder customer = Customer.builder();

        customer.customerPhone( CustomerDto.getCustomerPhone() );
        customer.customerAddress( CustomerDto.getCustomerAddress() );
        customer.user( CustomerDto.getUser() );

        return customer.build();
    }

    @Override
    public CustomerDto ToCustomerDto(Customer Customer) {
        if ( Customer == null ) {
            return null;
        }

        CustomerDto customerDto = new CustomerDto();

        customerDto.setCustomerPhone( Customer.getCustomerPhone() );
        customerDto.setCustomerAddress( Customer.getCustomerAddress() );
        customerDto.setUser( Customer.getUser() );

        return customerDto;
    }
}
