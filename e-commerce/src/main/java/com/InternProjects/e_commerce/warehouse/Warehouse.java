package com.InternProjects.e_commerce.warehouse;
import jakarta.persistence.*;


@Entity
@Table(name = "Warehouses")
public class Warehouse {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer warehouseId;

    @Column(name = "warehouse_name")
    private String warehouseName;

    @Column(name = "Location")
    private String location;

}
