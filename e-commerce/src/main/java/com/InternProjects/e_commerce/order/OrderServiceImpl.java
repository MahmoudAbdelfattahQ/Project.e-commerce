package com.InternProjects.e_commerce.order;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepo orderRepo;

    public OrderServiceImpl(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public void createOrder(OrderDto orderDto) {
        Order order = new Order();
        order.setOrderDate(orderDto.getOrderDate());
        order.setOrderItem(orderDto.getOrderItem());
        order.setOrderStatus(orderDto.getOrderStatus());
        order.setCustomerID(orderDto.getCustomerID());
        order.setShippingAddress(orderDto.getShippingAddress());
        order.setTotalAmount(orderDto.getTotalAmount());

        orderRepo.save(order);

    }

    @Override
    public void updateOrder(Order order) {
        orderRepo.save(order);

    }

    @Override
    public void deleteOrder(Long id) {
        orderRepo.deleteByOrderID(id);

    }

    @Override
    public Order getOrder(long id) {
           return orderRepo.findByOrderID(id);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }
}
