package com.InternProjects.e_commerce.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
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
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product_id",insertable = false ,updatable = false)
    private Product product;

}
