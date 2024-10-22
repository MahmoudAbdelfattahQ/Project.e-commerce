package com.InternProjects.e_commerce.product;

import com.InternProjects.e_commerce.cartProduct.CartProduct;
import com.InternProjects.e_commerce.orderItem.OrderItem;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Data
@Builder
@AllArgsConstructor
public class ProductDto {

    private String  title;
    private String  description;
    private Double  price;
    private String  brand;
    private String  category;
    private Double  weight;
    private Boolean  isAvailable;
    private Set<CartProduct> cartProducts;
    private List<OrderItem> ordersItem;

}
