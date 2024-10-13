package com.InternProjects.e_commerce.order;

import com.InternProjects.e_commerce.orderItem.OrderItemDto;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class OrderDto {

    private long customerID;
    private Timestamp orderDate;
    private double totalAmount;
    private String shippingAddress;
    private String orderStatus;
    private List<OrderItemDto> orderItem;

}
