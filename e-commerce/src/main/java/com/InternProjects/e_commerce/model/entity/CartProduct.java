package com.InternProjects.e_commerce.model.entity;

import jakarta.persistence.*;
import lombok.Data;



@Data
@Entity
@Table(name = "Cart_Products")
public class CartProduct {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "price" )
    private double price;

    @Column(name = "quantity" )
    private int quantity;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn( name = "Cart_id" ,insertable = false, updatable = false)
    private Cart cart;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn( name = "product_id",insertable = false, updatable = false)
    private Product product;


}
