package com.InternProjects.e_commerce.customer;

import com.InternProjects.e_commerce.user.User;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
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
