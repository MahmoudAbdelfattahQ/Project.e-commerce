package com.InternProjects.e_commerce.customer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.InternProjects.e_commerce.customer.CustomerTransformations.toCustomer;

@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepo customerRepo;

    @Autowired
    public CustomerServiceImpl(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    @Override
    public void saveCustomer(CustomerDto customerDto) {

         customerRepo.save(toCustomer(customerDto));
    }

    @Override
    public void updateCustomer(Customer customer) {

        customerRepo.findByCustomerId(customer.getCustomerId())
                .ifPresent(customer1 -> {
                    customer1.setCustomerId(customer.getCustomerId());
                    customer1.setCustomerAddress(customer.getCustomerAddress());
                    customer1.setCustomerPhone(customer.getCustomerPhone());
                    customer1.setUser(customer.getUser());
                    customerRepo.save(customer1);
                });

    }

    @Override
    public void deleteCustomer(Long id) {
        customerRepo.deleteByCustomerId(id);

    }

    @Override
    public Customer getCustomer(long id) {
         return customerRepo.findByCustomerId(id).get();

    }

    @Override
    public List<Customer> getCustomers() {
        return customerRepo.findAll();
    }
}
