package com.example.shoppingapp.controller;

import com.example.shoppingapp.dto.WarehousesDto;
import com.example.shoppingapp.dto.request.WarehousesRequest;
import com.example.shoppingapp.service.WarehousesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/warehouses")
public class WarehousesController {

    private WarehousesService warehousesService;

    @GetMapping(value = "/warehousesList")
    public List<WarehousesDto> getWarehousesInfo() {
        return warehousesService.getAll();
    }

    @GetMapping(value = "/getWarehousesByWarehouseID/{warehouseID}")
    public WarehousesDto getWarehousesByWarehouseID(@PathVariable(value = "warehouseID") Long warehouseID) {
        return getWarehousesByWarehouseID(warehouseID);
    }

    @PostMapping(value = "/saveWarehouse")
    public void saveWarehouse(@RequestBody WarehousesRequest warehousesRequest) {
        warehousesService.saveWarehouse(warehousesRequest);
    }

    @PostMapping(value = "/updateWarehouse")
    public void updateWarehouse(@RequestBody WarehousesRequest warehousesRequest) {
        warehousesService.updateWareHouse(warehousesRequest);
    }

    @DeleteMapping(value = "/deleteById/{warehouseID}")
    public void deleteById(@PathVariable(value = "warehouseID") Long warehouseID) {
        warehousesService.deleteById(warehouseID);
    }

}
