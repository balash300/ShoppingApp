package com.example.shoppingapp.service.impl;

import com.example.shoppingapp.dto.LocationDto;
import com.example.shoppingapp.dto.request.LocationRequest;
import com.example.shoppingapp.model.Locations;
import com.example.shoppingapp.repository.LocationRepository;
import com.example.shoppingapp.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class LocationImpl implements LocationService {

    private final LocationRepository locationRepository;

    @Override
    public LocationDto getLocationsByLocationID(Long locationID) {
        Locations locations = locationRepository.getLocationsByLocationID(locationID);
        return LocationDto.builder()
                .address(locations.getAddress())
                .postalCode(locations.getPostalCode())
                .city(locations.getCity())
                .state(locations.getState())
                .build();
    }

    @Override
    public void saveLocation(LocationRequest locationRequest) {
        Locations locations = Locations.builder()
                .address(locationRequest.getAddress())
                .postalCode(locationRequest.getPostalCode())
                .city(locationRequest.getCity())
                .state(locationRequest.getState())
                .build();
        locationRepository.save(locations);
    }

    @Override
    public void updateLocation(LocationRequest locationRequest) {
        Locations locations = Locations.builder()
                .locationID(locationRequest.getLocationID())
                .address(locationRequest.getAddress())
                .postalCode(locationRequest.getPostalCode())
                .city(locationRequest.getCity())
                .state(locationRequest.getState())
                .build();
        locationRepository.save(locations);
    }

    @Override
    public void deleteById(Long locationID) {
        if (locationID == null) {
            throw new RuntimeException("There is no such information");
        } else {
            locationRepository.deleteById(locationID);
        }
    }

    @Override
    public List<LocationDto> getAll() {
        List<Locations> locations = locationRepository.findAll();
        List<LocationDto> locationDtos = new ArrayList<>();

        for (Locations location : locations) {
            LocationDto locationDto = LocationDto.builder()
                    .address(location.getAddress())
                    .postalCode(location.getPostalCode())
                    .city(location.getCity())
                    .state(location.getState())
                    .build();
            locationDtos.add(locationDto);
        }

        return locationDtos;
    }
}
