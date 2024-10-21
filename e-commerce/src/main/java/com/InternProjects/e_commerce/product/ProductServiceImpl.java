package com.InternProjects.e_commerce.product;

import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }


    @Override
    public void addProduct(ProductDto productDto) {
        Product product = ProductMapper.Instance.mappToProduct(productDto);
        productRepo.save(product);
    }

    @Override
    public void updateProduct(Product product) {

     boolean exist=  productRepo.existsById(product.getId());

     if (!exist) {
         productRepo.save(product);
     }
    }

    @Override
    public void deleteProduct(Product product) {
        productRepo.delete(product);

    }

    @Override
    public void deleteProductById(long productId) {
        productRepo.deleteById(productId);
    }

    @Override
    public Product getProductById(long productId) {
        return productRepo.findById(productId);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepo.findAll();
    }
}
