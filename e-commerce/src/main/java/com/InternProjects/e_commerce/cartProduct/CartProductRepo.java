package com.InternProjects.e_commerce.cartProduct;

import com.InternProjects.e_commerce.carts.Cart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CartProductRepo extends JpaRepository<CartProduct, Integer> {

    CartProduct findById(long id);

    boolean existsById(long id);
    void deleteById(long id);
}
