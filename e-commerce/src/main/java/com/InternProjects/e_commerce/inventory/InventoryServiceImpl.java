package com.InternProjects.e_commerce.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import static com.InternProjects.e_commerce.utilits.Updates.updateValues;

@Service
public class InventoryServiceImpl implements InventoryService {

    private final InventoryRepo inventoryRepo;

    @Autowired
    public InventoryServiceImpl(InventoryRepo inventoryRepo) {

        this.inventoryRepo = inventoryRepo;
    }
    @Override
    public void addInventory(InventoryDto inventoryDto) {
        Inventory inventory = new Inventory();
        inventory.setProduct(inventoryDto.getProduct());
        inventory.setQuantity(inventoryDto.getQuantity());
        inventory.setProductId(inventoryDto.getProductId());
        inventory.setWarehouseId(inventoryDto.getWarehouseId());
        inventoryRepo.save(inventory);

    }

    @Override
    public void removeInventory(Long id) {
        inventoryRepo.deleteByInventoryId(id);

    }

    @Override
    public void updateInventory(Inventory inventory) {
        Inventory inventory1 = inventoryRepo.findByInventoryId(inventory.getInventoryId());
               inventoryRepo.save( updateValues(inventory,inventory1));

    }

    @Override
    public Inventory getInventory(long id) {
        return inventoryRepo.findByInventoryId(id);
    }

    @Override
    public List<Inventory> getAllInventory() {
        return inventoryRepo.findAll();
    }
}
