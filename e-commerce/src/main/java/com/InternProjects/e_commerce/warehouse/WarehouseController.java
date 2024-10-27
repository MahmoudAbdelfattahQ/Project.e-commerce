package com.InternProjects.e_commerce.warehouse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@CrossOrigin(origins = "*", methods =
        {RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE})

@RestController
@RequestMapping("warehouse")
public class WarehouseController {

    private final WarehouseServiceImpl warehouseServiceImpl;

    public WarehouseController( WarehouseServiceImpl warehouseServiceImpl) {
        this.warehouseServiceImpl = warehouseServiceImpl;
    }
    @PostMapping("add")
    public ResponseEntity<String> add(@RequestBody WarehouseDto warehouseDto) {
        warehouseServiceImpl.addWarehouse(warehouseDto);
        return ResponseEntity.ok("Warehouse added");
    }
    @GetMapping("getWarehouse/{id}")
    public ResponseEntity<Warehouse> getWarehouse(@PathVariable int id) {
        return new ResponseEntity<>(warehouseServiceImpl.getWarehouse(id), HttpStatus.OK);
    }

    @GetMapping("getAllWarehouse")
    public ResponseEntity<List<Warehouse>> getAllWarehouse() {
        return new ResponseEntity<>(warehouseServiceImpl.getWarehouses(), HttpStatus.OK);

    }

    @PutMapping("update")
    public ResponseEntity<String> update(@RequestBody Warehouse warehouse) {
       warehouseServiceImpl.updateWarehouse(warehouse);
        return ResponseEntity.ok("Warehouse updated");
    }
    @DeleteMapping("delete/{id}")
    public ResponseEntity<String> delete(@PathVariable int id) {
        warehouseServiceImpl.deleteWarehouse(id);
        return ResponseEntity.ok("Warehouse deleted");
    }

}
