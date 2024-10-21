package com.InternProjects.e_commerce.order;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("order")
public class OrderController {

    private final OrderService orderService;
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }
    @PostMapping("add")
    public ResponseEntity<String> addOrder(@RequestBody OrderDto orderDto) {

        orderService.createOrder(orderDto);
        return ResponseEntity.ok("Order added");
    }

    @GetMapping("getOrder/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable long id) {
        return new ResponseEntity<>(orderService.getOrder(id), HttpStatus.CREATED);
    }

    @GetMapping("getAll")
    public ResponseEntity<List<Order>> getAllOrders() {
        return new ResponseEntity<>(orderService.getAllOrders(), HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<String> updateOrder(@RequestBody Order order) {
            orderService.updateOrder(order);
            return ResponseEntity.ok("Order updated");
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteOrder(@PathVariable long id) {
        orderService.deleteOrder(id);
        return ResponseEntity.ok("Order deleted");
    }
}
