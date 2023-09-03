package com.example.shoppingapp.service;

import com.example.shoppingapp.dto.LocationDto;
import com.example.shoppingapp.dto.request.LocationRequest;

import java.util.List;

public interface LocationService {

    LocationDto getLocationsByLocationID(Long locationID);

    void saveLocation(LocationRequest locationRequest);

    void updateLocation(LocationRequest locationRequest);

    void deleteById(Long locationID);

    List<LocationDto> getAll();

}
