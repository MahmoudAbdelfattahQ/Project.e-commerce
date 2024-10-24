package com.InternProjects.e_commerce.cartProduct;

import com.InternProjects.e_commerce.carts.Cart;
import com.InternProjects.e_commerce.product.Product;
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
