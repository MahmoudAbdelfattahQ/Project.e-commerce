package com.InternProjects.e_commerce.inventory;

import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2024-10-17T04:20:19+0300",
    comments = "version: 1.5.2.Final, compiler: javac, environment: Java 17.0.10 (Oracle Corporation)"
)
public class InventoryMapperImpl implements InventoryMapper {

    @Override
    public Inventory toInventory(InventoryDto inventoryDto) {
        if ( inventoryDto == null ) {
            return null;
        }

        Inventory inventory = new Inventory();

        return inventory;
    }

    @Override
    public InventoryDto toInventoryDto(Inventory inventory) {
        if ( inventory == null ) {
            return null;
        }

        InventoryDto inventoryDto = new InventoryDto();

        return inventoryDto;
    }
}
