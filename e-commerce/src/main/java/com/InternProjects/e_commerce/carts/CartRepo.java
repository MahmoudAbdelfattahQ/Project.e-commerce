package com.InternProjects.e_commerce.carts;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface CartRepo  extends JpaRepository<Cart,Integer> {

    Optional<Cart> findByCustomerId(Integer id);
    Optional<Cart> findCartByCartId(Long cartId);


}
