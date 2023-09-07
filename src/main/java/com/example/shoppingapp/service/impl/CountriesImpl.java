package com.example.shoppingapp.service.impl;

import com.example.shoppingapp.dto.CountriesDto;
import com.example.shoppingapp.dto.request.CountriesRequest;
import com.example.shoppingapp.model.Countries;
import com.example.shoppingapp.repository.CountriesRepository;
import com.example.shoppingapp.service.CountriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service@RequiredArgsConstructor
public class CountriesImpl implements CountriesService {

    private final CountriesRepository countriesRepository;

    @Override
    public CountriesDto getCountriesByCountryID(Long countryID) {
        Countries countries = countriesRepository.getCountriesByCountryID(countryID);
        return CountriesDto.builder()
                .countryName(countries.getCountryName())
                .build();
    }

    @Override
    public void saveCountries(CountriesRequest countriesRequest) {
        Countries countries = Countries.builder()
                .countryName(countriesRequest.getCountryName())
                .build();
        countriesRepository.save(countries);
    }

    @Override
    public void updateCountries(CountriesRequest countriesRequest) {
        Countries countries = Countries.builder()
                .countryID(countriesRequest.getCountryID())
                .countryName(countriesRequest.getCountryName())
                .build();
        countriesRepository.save(countries);
    }

    @Override
    public void deleteById(Long countryID) {
        if (countryID == null) {
            throw new RuntimeException("There is no such information");
        } else {
            countriesRepository.deleteById(countryID);
        }
    }

    @Override
    public List<CountriesDto> getAll() {
        List<Countries> countries = countriesRepository.findAll();
        List<CountriesDto> countriesDtos = new ArrayList<>();

        for (Countries country : countries) {
            CountriesDto countriesDto = CountriesDto.builder()
                    .countryName(country.getCountryName())
                    .build();
            countriesDtos.add(countriesDto);
        }
        return countriesDtos;
    }
}
