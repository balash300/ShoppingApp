package com.example.shoppingapp.service;

import com.example.shoppingapp.dto.WarehousesDto;
import com.example.shoppingapp.dto.request.WarehousesRequest;

import java.util.List;

public interface WarehousesService {

    WarehousesDto getWarehousesByWarehouseID(Long warehouseID);

    void saveWarehouse(WarehousesRequest warehousesRequest);

    void updateWareHouse(WarehousesRequest warehousesRequest);

    void deleteById(Long id);

    List<WarehousesDto> getAll();

}
