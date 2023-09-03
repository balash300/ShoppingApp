package com.example.shoppingapp.service.impl;

import com.example.shoppingapp.dto.WarehousesDto;
import com.example.shoppingapp.dto.request.WarehousesRequest;
import com.example.shoppingapp.model.Warehouses;
import com.example.shoppingapp.repository.WarehousesRepository;
import com.example.shoppingapp.service.WarehousesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class WarehousesImpl implements WarehousesService {

    private final WarehousesRepository warehousesRepository;

    @Override
    public WarehousesDto getWarehousesByWarehouseID(Long warehouseID) {
        Warehouses warehouses = (Warehouses) warehousesRepository.getWarehousesByWarehouseID(warehouseID);
        return WarehousesDto.builder()
                .warehousesName(warehouses.getWarehouseName())
                .build();
    }

    @Override
    public void saveWarehouse(WarehousesRequest warehousesRequest) {
        Warehouses warehouses = Warehouses.builder()
                .warehouseName(warehousesRequest.getWarehouseName())
                .build();
        warehousesRepository.save(warehouses);
    }

    @Override
    public void updateWareHouse(WarehousesRequest warehousesRequest) {
        Warehouses warehouses = Warehouses.builder()
                .warehouseID(warehousesRequest.getWarehouseID())
                .warehouseName(warehousesRequest.getWarehouseName())
                .build();
        warehousesRepository.save(warehouses);
    }

    @Override
    public void deleteById(Long id) {
        if (id == null) {
            throw new RuntimeException("There is no such information");
        } else {
            warehousesRepository.deleteById(id);
        }
    }

    @Override
    public List<WarehousesDto> getAll() {
        List<Warehouses> warehouses = warehousesRepository.findAll();
        List<WarehousesDto> warehousesDtos = new ArrayList<>();

        for (int i = 0; i < warehouses.size(); i++) {
            WarehousesDto warehousesDto = WarehousesDto.builder()
                    .warehousesName(warehouses.get(i).getWarehouseName())
                    .build();
            warehousesDtos.add(warehousesDto);
        }
        return warehousesDtos;
    }
}
