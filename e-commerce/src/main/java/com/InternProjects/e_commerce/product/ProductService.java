package com.InternProjects.e_commerce.product;

import java.util.List;

public interface ProductService {

    void addProduct(ProductDto productDto);
    void updateProduct(Product product);
    void deleteProduct(Product product);
    void deleteProductById(long productId);
    Product getProductById(long productId);
    List<Product> getAllProducts();

}
