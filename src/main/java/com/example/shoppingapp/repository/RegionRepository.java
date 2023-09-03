package com.example.shoppingapp.repository;

import com.example.shoppingapp.model.Regions;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RegionRepository extends JpaRepository<Regions, Long> {

    Regions getRegionsByRegionID(Long regionID);

}
