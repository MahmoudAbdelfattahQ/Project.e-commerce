package com.InternProjects.e_commerce.orderItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderItemRepo extends JpaRepository<OrderItem, Integer> {

    Optional<OrderItem> findByOrderItemID(Long id);

    void deleteByOrderItemID(Long id);
}
