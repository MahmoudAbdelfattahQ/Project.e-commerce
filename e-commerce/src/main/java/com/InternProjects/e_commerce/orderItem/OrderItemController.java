package com.InternProjects.e_commerce.orderItem;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("orderItem")
public class OrderItemController {

    private final OrderItemService orderItemService;
    public OrderItemController(OrderItemService orderItemService) {
        this.orderItemService = orderItemService;
    }

    @PostMapping("add")
    public ResponseEntity<String> add(@RequestBody OrderItem orderItem) {
        orderItemService.create(orderItem);
        return new ResponseEntity<>("Success", HttpStatus.CREATED);
    }
    @GetMapping("getOrderItem/{id}")
    public ResponseEntity<OrderItem> getOrderItem(@PathVariable long id) {
        return new ResponseEntity<>(orderItemService.findById(id), HttpStatus.OK);

    }

    @GetMapping("getAllOrderItems")
    public ResponseEntity<List<OrderItem>> getAllOrderItems() {
        return new ResponseEntity<>(orderItemService.findAll(), HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<String> updateOrderItem(@RequestBody OrderItem orderItem) {
        orderItemService.update(orderItem);
        return new ResponseEntity<>("Success", HttpStatus.OK);
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteOrderItem(@PathVariable long id) {
        orderItemService.deleteByID(id);
        return ResponseEntity.ok("deleted successfully");
    }

}
