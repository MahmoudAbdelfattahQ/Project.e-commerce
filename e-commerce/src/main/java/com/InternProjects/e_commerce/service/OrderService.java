package com.InternProjects.e_commerce.service;

import com.InternProjects.e_commerce.model.entity.Order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    void createOrder(Order order);

    void updateOrder(Order order);

    void deleteOrder(int id);

    Optional<Order> getOrder(int id);

    List<Order> getAllOrders();

}
