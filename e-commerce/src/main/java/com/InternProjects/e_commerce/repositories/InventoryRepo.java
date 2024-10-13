package com.InternProjects.e_commerce.repositories;

import com.InternProjects.e_commerce.model.entity.Inventory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoryRepo extends JpaRepository<Inventory, Integer> {
}
