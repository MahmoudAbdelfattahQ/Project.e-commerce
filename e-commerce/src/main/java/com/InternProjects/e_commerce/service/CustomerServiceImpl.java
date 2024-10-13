package com.InternProjects.e_commerce.service;

import com.InternProjects.e_commerce.model.entity.Customer;
import com.InternProjects.e_commerce.repositories.CustomerRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public void saveCustomer(Customer customer) {
        customerRepo.save(customer);
    }

    @Override
    public void updateCustomer(Customer customer) {
        customerRepo.save(customer);

    }

    @Override
    public void deleteCustomer(int id) {
        customerRepo.deleteById(id);

    }

    @Override
    public Optional<Customer> getCustomer(int id) {
        return customerRepo.findById(id);

    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepo.findAll();
    }
}
