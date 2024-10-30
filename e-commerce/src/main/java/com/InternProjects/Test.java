package com.InternProjects;

import com.InternProjects.e_commerce.warehouse.Warehouse;

import static com.InternProjects.e_commerce.utilits.Updates.updateFields;
import static com.InternProjects.e_commerce.utilits.Updates.updateValues;

public class Test {

    public static void main(String[] args) {

        Warehouse target = new Warehouse();
        target.setWarehouseId(20);
        target.setWarehouseName("Cairo");
        target.setLocation("MasrelGadi");
        Warehouse source = new Warehouse();
        source.setWarehouseId(20);
        source.setWarehouseName("Aswan");


        System.out.println(updateFields(source ,target) );


    }


}
