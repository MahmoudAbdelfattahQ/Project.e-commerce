package com.InternProjects.e_commerce.service;

import com.InternProjects.e_commerce.model.entity.OrderItem;

import java.util.List;
import java.util.Optional;

public interface OrderItemService {

    void create(OrderItem orderItem);

    void update(OrderItem orderItem);

    void deleteOrderItem(OrderItem orderItem);

    void deleteByID(int id);

    OrderItem findByID(int id);

    Optional<OrderItem> findById(int id);

    List<OrderItem> findAll();
}
