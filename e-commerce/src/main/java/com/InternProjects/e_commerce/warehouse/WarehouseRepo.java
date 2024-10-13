package com.InternProjects.e_commerce.warehouse;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WarehouseRepo  extends JpaRepository<Warehouse, Integer> {
}
