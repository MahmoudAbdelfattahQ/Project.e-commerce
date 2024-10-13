package com.InternProjects.e_commerce.model.entity;

import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "Customers")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    @Column(name = "Phone", unique = true ,nullable = false)
    private String customerPhone;
    @Column(name = "Address",nullable = false)
    private String customerAddress;
    @OneToOne
    @JoinColumn(name = "User_ID")
    private User user;

}
