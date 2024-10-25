package com.InternProjects.e_commerce.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer> {

    Product findById(long id);
    Boolean existsById(long id);
    void deleteById(long id);
}
