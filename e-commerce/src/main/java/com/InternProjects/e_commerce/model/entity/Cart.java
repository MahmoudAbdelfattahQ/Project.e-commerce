package com.InternProjects.e_commerce.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.HashSet;
import java.util.Set;

@Data
@Entity
@Table(name = "Cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;

     @Column(name = "Total_price")
    private double totalPrice;

    @Column(name = "Customer_ID")
    private int customerId;

    @OneToMany(mappedBy = "Cart_ID" ,fetch = FetchType.EAGER)
    private Set<CartProducts> cartProducts = new HashSet<>();

}
