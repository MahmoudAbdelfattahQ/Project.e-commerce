package com.InternProjects.e_commerce.product;

import org.springframework.stereotype.Service;

import java.util.List;

import static com.InternProjects.e_commerce.utilits.Updates.updateValues;

@Service
public class ProductServiceImpl implements ProductService {

    private final ProductRepo productRepo;

    public ProductServiceImpl(ProductRepo productRepo) {
        this.productRepo = productRepo;
    }


    @Override
    public void addProduct(ProductDto productDto) {
        Product product = new Product();
        product.setCartProducts(productDto.getCartProducts());
        product.setBrand(productDto.getBrand());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setPrice(productDto.getPrice());
        product.setIsAvailable(productDto.getIsAvailable());
        product.setWeight(productDto.getWeight());
        product.setTitle(productDto.getTitle());
        productRepo.save(product);
    }

    @Override
    public void updateProduct(Product product) {

        Product existingProduct = productRepo.findById(product.getId());
        productRepo.save( updateValues(product, existingProduct) );



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
