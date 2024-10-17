package com.InternProjects.e_commerce.cartProduct;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("cartProduct")
public class CartProductController {

    private final CartProductService cartProductService;

    public CartProductController(CartProductService cartProductService, CartProductRepo cartProductRepo) {
        this.cartProductService = cartProductService;
    }

    @PostMapping("add")
    public ResponseEntity<String> create(@RequestBody CartProductDto cartProductDto) {
         cartProductService.createCart(cartProductDto);
          return new  ResponseEntity<>("Success add new cart  product",HttpStatus.CREATED);

    }

    @GetMapping("get/{id}")
    public CartProduct getCartProduct(@PathVariable long id) {
      return   cartProductService.getCart(id);
    }

    @PutMapping("update")
    public ResponseEntity<String> update( @RequestBody CartProduct cartProduct) {
        cartProductService.updateCart(cartProduct);
        return new ResponseEntity<>("Success update cart  product",HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        cartProductService.deleteCart(id);
        return new ResponseEntity<>( "Deleted successfully",HttpStatus.OK);
    }

    @GetMapping("getAllCartProduct")
    public List<CartProduct> getAllCartProduct() {
        return cartProductService.getCarts();
    }
}
