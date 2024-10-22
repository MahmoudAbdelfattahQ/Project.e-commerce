package com.InternProjects.e_commerce.inventory;

import com.InternProjects.e_commerce.product.Product;
import lombok.Data;


@Data

public class InventoryDto {

    private Long productId;
    private Integer warehouseId;
    private Integer quantity;
    private Product product;
}
