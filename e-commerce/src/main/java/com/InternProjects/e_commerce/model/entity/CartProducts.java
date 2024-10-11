package com.InternProjects.e_commerce.model.entity;

import jakarta.persistence.*;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "Cart_Products")
public class CartProducts {

    @Id
    private long id;

    @ManyToOne
    @JoinColumn(name = "cart_id" )
    private Cart cart;

    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products product;

    @Column(name = "price" )
    private double price;

    @Column(name = "quantity" )
    private int quantity;





}
