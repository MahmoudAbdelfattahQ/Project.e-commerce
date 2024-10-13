package com.InternProjects.e_commerce.model.dto;

import com.InternProjects.e_commerce.model.entity.Product;
import lombok.Data;


@Data
public class InventoryDto {

    private Long productId;
    private Integer warehouseId;
    private Integer quantity;
    private Product product;
}
