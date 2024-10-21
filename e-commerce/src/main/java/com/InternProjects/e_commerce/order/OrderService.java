package com.InternProjects.e_commerce.order;

import java.util.List;
import java.util.Optional;

public interface OrderService {

    void createOrder(OrderDto orderDto);

    void updateOrder(Order order);

    void deleteOrder(Long id);

    Order getOrder(long id);

    List<Order> getAllOrders();

}
