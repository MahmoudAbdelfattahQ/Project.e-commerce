package com.InternProjects.e_commerce.warehouse;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface WarehouseMapper {

        WarehouseMapper Instance = Mappers.getMapper(WarehouseMapper.class);
        Warehouse toWarehouse(WarehouseDto warehouseDto);
        WarehouseDto toWarehouseDto(Warehouse warehouse);

}
