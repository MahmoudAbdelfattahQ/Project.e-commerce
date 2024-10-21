package com.InternProjects.e_commerce.inventory;

import java.util.List;

public interface InventoryService {
    void addInventory(InventoryDto inventoryDto);
    void removeInventory(Long id);
    void updateInventory(Inventory inventory);
    Inventory getInventory(long id);
    List<Inventory> getAllInventory();
}
