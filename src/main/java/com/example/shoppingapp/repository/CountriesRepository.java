package com.example.shoppingapp.repository;

import com.example.shoppingapp.model.Countries;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CountriesRepository extends JpaRepository<Countries, Long> {

    Countries getCountriesByCountryID(Long countryID);

}
