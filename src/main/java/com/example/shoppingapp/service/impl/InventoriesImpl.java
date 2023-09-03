package com.example.shoppingapp.service.impl;

import com.example.shoppingapp.dto.InventoriesDto;
import com.example.shoppingapp.dto.ProductDto;
import com.example.shoppingapp.dto.WarehousesDto;
import com.example.shoppingapp.dto.request.InventoriesRequest;
import com.example.shoppingapp.model.Inventories;
import com.example.shoppingapp.model.Products;
import com.example.shoppingapp.model.Warehouses;
import com.example.shoppingapp.repository.InventoriesRepository;
import com.example.shoppingapp.repository.ProductRepository;
import com.example.shoppingapp.repository.WarehousesRepository;
import com.example.shoppingapp.service.InventoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class InventoriesImpl implements InventoriesService {

    private final ProductRepository productRepository;
    private final WarehousesRepository warehousesRepository;
    private final InventoriesRepository inventoriesRepository;

    @Override
    public InventoriesDto getInventoriesByProductIDAndWarehouseID(Long productID, Long warehouseID) {
        Products products = (Products) productRepository.getProductsByProductID(productID);
        Warehouses warehouses = (Warehouses) warehousesRepository.getWarehousesByWarehouseID(warehouseID);
        return InventoriesDto.builder()
                .quantity(products.getProductID())
                .quantity(warehouses.getWarehouseID())
                .build();
    }

    @Override
    public void saveInventories(InventoriesRequest inventoriesRequest) {
        Inventories inventories = Inventories.builder()
                .quantity(inventoriesRequest.getQuantity())
                .build();
        inventoriesRepository.save(inventories);
    }

    @Override
    public void updateInventories(InventoriesRequest inventoriesRequest) {
        Inventories inventories = Inventories.builder()
                .id(inventoriesRequest.getId())
                .quantity(inventoriesRequest.getQuantity())
                .build();
        inventoriesRepository.save(inventories);
    }

//    @Override
//    public void deleteByID(ProductDto productID, WarehousesDto warehouseID) {
//
//        Products products = (Products) productRepository.getProductsByProductID(productID);
//        Warehouses warehouses = (Warehouses) warehousesRepository.getWarehousesByWarehouseID(warehouseID);
//        if (products.getProductID().equals(null) || warehouses.getWarehouseID().equals(null)) {
//            throw new RuntimeException("There is no such information");
//        } else {
//            inventoriesRepository.deleteById(productID, warehouseID);
//        }
//
//    }

    @Override
    public List<InventoriesDto> getAll() {
        List<Inventories> inventories = inventoriesRepository.findAll();
        List<InventoriesDto> inventoriesDtos = new ArrayList<>();

        for (Inventories inventory: inventories) {
            InventoriesDto inventoriesDto = InventoriesDto.builder()
                    .quantity(inventory.getQuantity())
                    .build();
            inventoriesDtos.add(inventoriesDto);
        }
        return inventoriesDtos;
    }
}
