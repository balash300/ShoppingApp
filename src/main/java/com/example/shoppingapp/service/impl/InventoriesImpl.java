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

    private final InventoriesRepository inventoriesRepository;

    @Override
    public InventoriesDto getInventoriesById(Long id) {
        Inventories inventories = inventoriesRepository.getInventoriesById(id);
        return InventoriesDto.builder()
                .quantity(inventories.getQuantity())
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

    @Override
    public void deleteById(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");
        } else {
            inventoriesRepository.deleteById(id);
        }
    }


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
