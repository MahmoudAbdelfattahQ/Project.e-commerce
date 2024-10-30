package com.InternProjects.e_commerce.orderItem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

import static com.InternProjects.e_commerce.utilits.Updates.updateFields;

@Service
public class OrderItemServiceImpl implements OrderItemService {

    private final OrderItemRepo orderItemRepo;

    @Autowired
    public OrderItemServiceImpl(OrderItemRepo orderItemRepo) {
        this.orderItemRepo = orderItemRepo;
    }

    @Override
    public void create(OrderItem orderItem) {
        orderItemRepo.save(orderItem);

    }

    @Override
    public void update(OrderItem orderItem) {
       orderItemRepo.findByOrderItemID(orderItem.getOrderItemID()).ifPresent(
               orderItem1 -> {

                       orderItemRepo.save(updateFields(orderItem,orderItem1));
               }
       );

    }

    @Override
    public void deleteOrderItem(OrderItem orderItem) {
        orderItemRepo.delete(orderItem);
    }

    @Override
    public void deleteByID(long id) {
     orderItemRepo.deleteByOrderItemID(id);
    }

    @Override
    public OrderItem findByID(long id) {
        return null;
    }

    @Override
    public OrderItem findById(long id) {
      return orderItemRepo.findByOrderItemID(id).get();

    }

    @Override
    public List<OrderItem> findAll() {
        return orderItemRepo.findAll();
    }
}
