package com.InternProjects.e_commerce.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.sql.Timestamp;
import java.util.List;

@Data
@Entity
@Table(name = "Orders")
public class Orders {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderID;

    @Column(name = "customer_id" , nullable = false)
    private long customerID;

    @Column(name = "Order_date")
    private Timestamp orderDate;

    @Column(name = "Total_Amount")
    private double totalAmount;

    @Column(name = "Shipping_Address")
    private String shippingAddress;

    @Column(name = "Order_status")
    private String orderStatus;

    @OneToMany(mappedBy = "order" ,fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    private List<OrderItem> orderItem;

}
