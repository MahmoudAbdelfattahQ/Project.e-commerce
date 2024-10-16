package com.InternProjects.e_commerce.carts;

import com.InternProjects.e_commerce.cartProduct.CartProduct;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "Cart")
public class Cart {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cart_id")
    private Long cartId ;


    @Column(name = "Total_price")
    private double totalPrice;

    @Column(name = "Customer_ID")
    private int customerId;


    @OneToMany(mappedBy = "cart" ,fetch = FetchType.EAGER ,cascade = CascadeType.ALL)
    private Set<CartProduct> cartProducts = new HashSet<>();

}
