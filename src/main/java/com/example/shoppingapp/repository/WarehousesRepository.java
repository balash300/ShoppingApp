package com.example.shoppingapp.repository;

import com.example.shoppingapp.dto.WarehousesDto;
import com.example.shoppingapp.model.Warehouses;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface WarehousesRepository extends JpaRepository<Warehouses, Long> {

    List<Warehouses> getWarehousesByWarehouseID(Long warehouseID);

}
