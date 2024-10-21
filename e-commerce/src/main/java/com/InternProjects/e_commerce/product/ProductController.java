package com.InternProjects.e_commerce.product;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("Product")
public class ProductController {
    private final ProductService productService;
    public ProductController(ProductService productService) {

        this.productService = productService;
    }

    @PostMapping("addProduct")
    public ResponseEntity<String> addProduct(@RequestBody ProductDto productDto) {
        productService.addProduct(productDto);

        return new ResponseEntity<>("success", HttpStatus.CREATED);

    }

    @GetMapping("getProduct/{id}")
    public ResponseEntity<Product> getProduct(@PathVariable long id) {
        return new ResponseEntity<>(productService.getProductById(id),HttpStatus.OK);
    }

    @GetMapping("getAllProducts")
    public ResponseEntity<List<Product>> getAllProducts() {
        return new ResponseEntity<>(productService.getAllProducts(),HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<String> updateProduct( @RequestBody Product product) {
        productService.updateProduct(product);
        return new ResponseEntity<>("success", HttpStatus.OK);

    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteProduct(@PathVariable long id) {
        productService.deleteProductById(id);
        return new ResponseEntity<>("deleted successfully", HttpStatus.OK);
    }



}
