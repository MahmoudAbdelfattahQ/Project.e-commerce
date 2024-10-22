package com.InternProjects.e_commerce.warehouse;

import java.util.List;

public interface WarehouseService {

    void addWarehouse(WarehouseDto warehouseDto);
    void updateWarehouse(Warehouse warehouse);
    void deleteWarehouse(int warehouseId);
    Warehouse getWarehouse(int warehouseId);
    List<Warehouse> getWarehouses();

}
