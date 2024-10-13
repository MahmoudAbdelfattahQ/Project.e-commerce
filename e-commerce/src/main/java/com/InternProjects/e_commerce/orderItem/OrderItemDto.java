package com.InternProjects.e_commerce.orderItem;

import com.InternProjects.e_commerce.order.OrderDto;
import com.InternProjects.e_commerce.product.Product;
import lombok.Data;

@Data
public class OrderItemDto {

    private int quantity;
    private double itemPrice;
    private OrderDto order;
    private Product product;

}
