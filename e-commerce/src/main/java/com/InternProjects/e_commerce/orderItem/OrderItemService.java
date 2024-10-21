package com.InternProjects.e_commerce.orderItem;

import java.util.List;
import java.util.Optional;

public interface OrderItemService {

    void create(OrderItem orderItem);

    void update(OrderItem orderItem);

    void deleteOrderItem(OrderItem orderItem);

    void deleteByID(long id);

    OrderItem findByID(long id);

    OrderItem findById(long id);

    List<OrderItem> findAll();
}
