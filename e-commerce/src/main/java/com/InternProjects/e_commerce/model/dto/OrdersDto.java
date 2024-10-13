package com.InternProjects.e_commerce.model.dto;

import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
public class OrdersDto {

    private long customerID;
    private Timestamp orderDate;
    private double totalAmount;
    private String shippingAddress;
    private String orderStatus;
    private List<OrderItemDto> orderItem;

}
