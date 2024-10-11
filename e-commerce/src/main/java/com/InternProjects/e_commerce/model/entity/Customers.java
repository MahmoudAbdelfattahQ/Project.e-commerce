package com.InternProjects.e_commerce.model.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.util.UUID;

@Data
@Entity
@Table(name = "Customers")
public class Customers {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long customerId;
    @Column(name = "Phone", unique = true ,nullable = false)
    private String customerPhone;
    @Column(name = "Address",nullable = false)
    private String customerAddress;
    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "User_id" ,referencedColumnName = "User_ID" ,nullable = false  )
    private Users user;

}
