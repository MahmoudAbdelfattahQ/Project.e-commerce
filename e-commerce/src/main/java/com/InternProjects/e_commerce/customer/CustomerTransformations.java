package com.InternProjects.e_commerce.customer;



public class CustomerTransformations {

    private CustomerTransformations(){}
    public static Customer toCustomer(CustomerDto customerDto) {
        return Customer.builder()
                .customerPhone(customerDto.getCustomerPhone())
                .customerAddress(customerDto.getCustomerAddress())
                .user(customerDto.getUser())
                .build();
    }

}
