package com.InternProjects.e_commerce.inventory;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("inventory")
public class InventoryController {

    private final InventoryService inventoryService;

    public InventoryController(InventoryService inventoryService) {
        this.inventoryService = inventoryService;
    }

    @PostMapping("add")
    public ResponseEntity<String> add(@RequestBody InventoryDto inventoryDto) {

        inventoryService.addInventory(inventoryDto);

        return new ResponseEntity<>("Add inventory successfully", HttpStatus.CREATED);
    }

    @GetMapping("get/{id}")
    public ResponseEntity<Inventory> getInventory(@PathVariable long id) {
        return new ResponseEntity<>(inventoryService.getInventory(id), HttpStatus.OK);
    }
    @GetMapping("getAll")
    public ResponseEntity<List<Inventory>> getAllInventory() {
        return new ResponseEntity<>(inventoryService.getAllInventory(), HttpStatus.OK);
    }

    @PutMapping("update")
    public ResponseEntity<String> update(@RequestBody Inventory inventory) {
        inventoryService.updateInventory(inventory);
        return new ResponseEntity<>("Update inventory successfully", HttpStatus.OK);
    }

    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> delete(@PathVariable long id) {
        inventoryService.removeInventory(id);
        return new ResponseEntity<>("Delete inventory successfully", HttpStatus.OK);
    }


}
