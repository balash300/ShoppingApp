package com.example.shoppingapp.repository;

import com.example.shoppingapp.model.Locations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LocationRepository extends JpaRepository<Locations, Long> {

    Locations getLocationsByLocationID(Long locationID);

}
