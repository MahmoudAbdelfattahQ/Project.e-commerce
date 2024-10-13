package com.InternProjects.e_commerce.repositories;

import com.InternProjects.e_commerce.model.entity.OrderItem;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface OrderItemRepo extends JpaRepository<OrderItem, Integer> {

    Optional<OrderItem> findById(Long id);
}
