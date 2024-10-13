package com.InternProjects.e_commerce.order;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderServiceImpl implements OrderService {

    private final OrderRepo orderRepo;

    public OrderServiceImpl(OrderRepo orderRepo) {
        this.orderRepo = orderRepo;
    }

    @Override
    public void createOrder(Order order) {
        orderRepo.save(order);

    }

    @Override
    public void updateOrder(Order order) {
        orderRepo.save(order);

    }

    @Override
    public void deleteOrder(int id) {
        orderRepo.deleteById(id);

    }

    @Override
    public Optional<Order> getOrder(int id) {
        return orderRepo.findById(id);
    }

    @Override
    public List<Order> getAllOrders() {
        return orderRepo.findAll();
    }
}
