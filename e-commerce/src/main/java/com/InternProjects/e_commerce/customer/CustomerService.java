package com.InternProjects.e_commerce.customer;

import java.util.List;
import java.util.Optional;


public interface CustomerService  {
    void saveCustomer(CustomerDto customerDto);
    void updateCustomer(Customer customer);
    void deleteCustomer(Long id);
    Customer getCustomer(long id);
    List<Customer> getCustomers();

}
