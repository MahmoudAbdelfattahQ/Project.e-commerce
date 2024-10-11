package com.InternProjects.e_commerce.model.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.HashSet;
import java.util.Set;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "Products")
public class Products {
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

    @OneToMany(mappedBy = "cart", fetch = FetchType.EAGER)
    private Set<CartProducts> cartProducts = new HashSet<>();
}
