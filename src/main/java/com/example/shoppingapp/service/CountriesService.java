package com.example.shoppingapp.service;

import com.example.shoppingapp.dto.CountriesDto;
import com.example.shoppingapp.dto.request.CountriesRequest;

import java.util.List;

public interface CountriesService {

    CountriesDto getCountriesByCountryID(Long countryID);

    void saveCountries(CountriesRequest countriesRequest);

    void updateCountries(CountriesRequest countriesRequest);

    void deleteById(Long countryID);

    List<CountriesDto> getAll();

}
