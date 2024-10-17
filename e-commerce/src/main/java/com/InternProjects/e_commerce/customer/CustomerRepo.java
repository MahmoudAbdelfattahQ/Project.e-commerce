package com.InternProjects.e_commerce.customer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface CustomerRepo extends JpaRepository<Customer,Integer> {
    void deleteByCustomerId(long customerId);
    Optional<Customer> findByCustomerId(long customerId);
    Customer findByUserUserId(UUID user_userId);

}
