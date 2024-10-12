package com.InternProjects.e_commerce.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Order_Items")
public class OrderItem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long orderItemID;

    @Column(name = "Quantity")
    private int quantity;

    @Column(name = "Item_price")
    private double itemPrice;

    @ManyToOne
    @JoinColumn(name = "order_id",insertable = false ,updatable = false)
    private Orders order;

    @ManyToOne
    @JoinColumn(name = "product_id",insertable = false ,updatable = false)
    private Products product;

}
