package com.InternProjects.e_commerce.inventory;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface InventoryMapper {

        InventoryMapper Instance = Mappers.getMapper(InventoryMapper.class);
        Inventory toInventory(InventoryDto inventoryDto);
        InventoryDto toInventoryDto(Inventory inventory);
}
