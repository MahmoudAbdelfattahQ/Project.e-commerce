package com.InternProjects.e_commerce.inventory;

import com.InternProjects.e_commerce.product.Product;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "inventory")
public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long inventoryId;

    @Column(name = "Product_ID")
    private Long productId;

    @Column(name = "Warehouse_ID")
    private Integer warehouseId;

    @Column(name = "quantity")
    private Integer quantity;

    @ManyToOne
    @JoinColumn(name = "Product_ID", referencedColumnName = "product_Id", insertable = false, updatable = false)
    private Product product;
}
