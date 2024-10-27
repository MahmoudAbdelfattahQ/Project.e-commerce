package com.InternProjects.e_commerce.warehouse;

import org.springframework.stereotype.Service;

import java.util.List;

import static com.InternProjects.e_commerce.utilits.Updates.updateValues;


@Service
public class WarehouseServiceImpl implements WarehouseService {

    private final WarehouseRepo warehouseRepo;

    public WarehouseServiceImpl(WarehouseRepo warehouseRepo) {
        this.warehouseRepo = warehouseRepo;
    }


    @Override
    public void addWarehouse(WarehouseDto warehouseDto) {
        Warehouse warehouse = new Warehouse();
        warehouse.setWarehouseName(warehouseDto.getWarehouseName());
        warehouse.setLocation(warehouseDto.getLocation());
        warehouseRepo.save(warehouse);

    }

    @Override
    public void updateWarehouse(Warehouse warehouse) {


        Warehouse warehouse1 = warehouseRepo.findById(warehouse.getWarehouseId()).get();
        Warehouse warehouse2 = (Warehouse) updateValues(warehouse, warehouse1);
        warehouseRepo.save( warehouse2);

    }

    @Override
    public void deleteWarehouse(int warehouseId) {
        warehouseRepo.deleteById(warehouseId);

    }

    @Override
    public Warehouse getWarehouse(int warehouseId) {
        return warehouseRepo.findById(warehouseId).get();
    }

    @Override
    public List<Warehouse> getWarehouses() {
        return warehouseRepo.findAll();
    }
}
