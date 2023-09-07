package com.example.shoppingapp.controller;

import com.example.shoppingapp.dto.CountriesDto;
import com.example.shoppingapp.dto.request.CountriesRequest;
import com.example.shoppingapp.service.CountriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/countries")
public class CountriesController {

    final CountriesService countriesService;

    @GetMapping(value = "/countriesList")
    public List<CountriesDto> getCountriesInfo() {
        return countriesService.getAll();
    }

    @GetMapping(value = "/getCountriesByCountryID/{countryID}")
    public CountriesDto getCountriesByCountryID(@PathVariable(value = "countryID") Long countryID) {
        return getCountriesByCountryID(countryID);
    }

    @PostMapping(value = "/saveCountries")
    public void saveCountries(@RequestBody CountriesRequest countriesRequest) {
        countriesService.saveCountries(countriesRequest);
    }

    @PostMapping(value = "/updateCountries")
    public void updateCountries(@RequestBody CountriesRequest countriesRequest) {
        countriesService.updateCountries(countriesRequest);
    }

    @DeleteMapping(value = "/deleteById/{countryID}")
    public void deleteById(@PathVariable(value = "countryID") Long countryID) {
        countriesService.deleteById(countryID);
    }

}
