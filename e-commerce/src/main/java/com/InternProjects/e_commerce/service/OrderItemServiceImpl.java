package com.InternProjects.e_commerce.service;

import com.InternProjects.e_commerce.model.entity.OrderItem;
import com.InternProjects.e_commerce.repositories.OrderItemRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    private final OrderItemRepo orderItemRepo;

    public OrderItemServiceImpl(OrderItemRepo orderItemRepo) {
        this.orderItemRepo = orderItemRepo;
    }

    @Override
    public void create(OrderItem orderItem) {
        orderItemRepo.save(orderItem);

    }

    @Override
    public void update(OrderItem orderItem) {
       orderItemRepo.findById(orderItem.getOrderItemID())
               .ifPresentOrElse(orderItem1 -> {
                       orderItem1.setItemPrice(orderItem.getItemPrice()),
                       orderItem1.setQuantity(orderItem.getQuantity()),
                       orderItem1.setOrder(orderItem.getOrder()),
                       orderItem1.setProduct(orderItem.getProduct()),

               }, null  );

    }

    @Override
    public void deleteOrderItem(OrderItem orderItem) {
        orderItemRepo.delete(orderItem);
    }

    @Override
    public void deleteByID(int id) {
     orderItemRepo.deleteById(id);
    }

    @Override
    public Optional<OrderItem> findById(int id) {
        return orderItemRepo.findById(id);
    }

    @Override
    public List<OrderItem> findAll() {
        return orderItemRepo.findAll();
    }
}
