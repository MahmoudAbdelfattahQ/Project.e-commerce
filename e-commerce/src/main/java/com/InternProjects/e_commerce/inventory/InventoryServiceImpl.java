package com.InternProjects.e_commerce.inventory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryServiceImpl implements InventoryService {

    private final InventoryRepo inventoryRepo;

    @Autowired
    public InventoryServiceImpl(InventoryRepo inventoryRepo) {

        this.inventoryRepo = inventoryRepo;
    }
    @Override
    public void addInventory(InventoryDto inventoryDto) {
        Inventory inventory = InventoryMapper.Instance.toInventory(inventoryDto);
        inventoryRepo.save(inventory);

    }

    @Override
    public void removeInventory(Long id) {
        inventoryRepo.deleteByInventoryId(id);

    }

    @Override
    public void updateInventory(Inventory inventory) {
        inventoryRepo.save(inventory);

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
