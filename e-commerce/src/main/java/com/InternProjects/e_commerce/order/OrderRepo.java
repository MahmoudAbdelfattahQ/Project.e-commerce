package com.InternProjects.e_commerce.order;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepo extends JpaRepository<Order,Integer> {

    void deleteByOrderID(long orderId);
    Order findByOrderID(long orderId);
}
