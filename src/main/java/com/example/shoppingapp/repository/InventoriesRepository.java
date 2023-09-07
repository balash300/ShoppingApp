package com.example.shoppingapp.repository;

import com.example.shoppingapp.model.Inventories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InventoriesRepository extends JpaRepository<Inventories, Long> {

    Inventories getInventoriesById(Long id);

}
