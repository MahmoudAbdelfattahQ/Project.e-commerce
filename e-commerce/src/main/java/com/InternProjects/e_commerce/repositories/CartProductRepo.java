package com.InternProjects.e_commerce.repositories;

import com.InternProjects.e_commerce.model.entity.CartProduct;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartProductRepo extends JpaRepository<CartProduct, Integer> {
}
