package com.InternProjects.e_commerce.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Product_ID")
    private Long id;

    @Column(name = "Title" ,nullable = false)
    private String  title;

    @Column(name = "Description")
    private String  description;

    @Column(name = "Price" ,nullable = false)
    private Double  price;

    @Column(name = "Brand")
    private String  brand;

    @Column(name = "Category")
    private String  category;

    @Column(name = "Weight")
    private Double  weight;

    @Column(name = "Is_Available")
    private Boolean  isAvailable;

    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    private Set<CartProduct> cartProducts = new HashSet<>();

    @OneToMany(mappedBy = "product", fetch = FetchType.EAGER , cascade = CascadeType.ALL)
    private List<OrderItem> ordersItem = new ArrayList<>();
}
