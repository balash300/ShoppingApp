package com.example.shoppingapp.service;

import com.example.shoppingapp.dto.InventoriesDto;
import com.example.shoppingapp.dto.ProductDto;
import com.example.shoppingapp.dto.WarehousesDto;
import com.example.shoppingapp.dto.request.InventoriesRequest;

import java.util.List;

public interface InventoriesService {

    InventoriesDto getInventoriesById(Long id);

    void saveInventories(InventoriesRequest inventoriesRequest);

    void updateInventories(InventoriesRequest inventoriesRequest);

    void deleteById(Long id);

    List<InventoriesDto> getAll();

}
