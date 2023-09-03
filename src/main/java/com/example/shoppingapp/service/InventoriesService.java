package com.example.shoppingapp.service;

import com.example.shoppingapp.dto.InventoriesDto;
import com.example.shoppingapp.dto.ProductDto;
import com.example.shoppingapp.dto.WarehousesDto;
import com.example.shoppingapp.dto.request.InventoriesRequest;

import java.util.List;

public interface InventoriesService {

    InventoriesDto getInventoriesByProductIDAndWarehouseID(Long productID, Long warehouseID);

    void saveInventories(InventoriesRequest inventoriesRequest);

    void updateInventories(InventoriesRequest inventoriesRequest);

//    void deleteByID(ProductDto productID, WarehousesDto warehouseID);

    List<InventoriesDto> getAll();

}
