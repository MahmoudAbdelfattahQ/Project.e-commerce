package com.InternProjects.e_commerce.service;

import com.InternProjects.e_commerce.model.entity.Customer;

import java.util.List;
import java.util.Optional;


public interface CustomerService  {
    void saveCustomer(Customer customer);
    void updateCustomer(Customer customer);
    void deleteCustomer(int id);
    Optional<Customer> getCustomer(int id);
    List<Customer> getCustomers();

}
