package com.InternProjects.e_commerce.cart;

import com.InternProjects.e_commerce.cartProduct.CartProduct;
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
    private Long CartId ;

    @Column(name = "Total_price")
    private double totalPrice;

    @Column(name = "Customer_ID")
    private int customerId;

    @OneToMany(mappedBy = "cart" ,fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
    private Set<CartProduct> cartProducts = new HashSet<>();

}
