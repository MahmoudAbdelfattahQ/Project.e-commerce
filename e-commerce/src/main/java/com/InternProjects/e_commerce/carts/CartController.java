package com.InternProjects.e_commerce.carts;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;
    public CartController(CartService cartService) {
        this.cartService = cartService;

    }


    @PostMapping("add")
    public ResponseEntity<String> addCart(@RequestBody CartDto cartDto) {
        cartService.addCart(cartDto);
        return new ResponseEntity<>("Added cart successfully", HttpStatus.CREATED);
    }

    @GetMapping("getCart/{id}")
    public Cart getCart(@PathVariable Long id) {
        return cartService.getCartByCartId(id);
    }

    @PutMapping("update")
    public ResponseEntity<String> updateCart( @RequestBody Cart cart) {
        cartService.updateCart(cart);

        return new ResponseEntity<>("The cart has been updated", HttpStatus.CREATED);

    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> deleteCart(@PathVariable Long id) {
            cartService.deleteCart(id);
            return new ResponseEntity<>("The cart has been deleted", HttpStatus.OK);
    }


    @GetMapping("getCarts")
    public List<Cart> getCarts() {
      return   cartService.getAllCarts();
    }
}
