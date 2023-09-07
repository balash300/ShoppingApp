package com.example.shoppingapp.controller;

import com.example.shoppingapp.dto.LocationDto;
import com.example.shoppingapp.dto.request.LocationRequest;
import com.example.shoppingapp.service.LocationService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/locations")
public class LocationController {

    private LocationService locationService;

    @GetMapping(value = "/locationList")
    public List<LocationDto> getLocationInfo() {
        return locationService.getAll();
    }

    @GetMapping(value = "/getLocationsByLocationID/{locationID}")
    public LocationDto getLocationsByLocationID(@PathVariable(value = "locationID") Long locationID) {
        return getLocationsByLocationID(locationID);
    }

    @PostMapping(value = "/saveLocation")
    public void saveLocation(@RequestBody LocationRequest locationRequest) {
        locationService.saveLocation(locationRequest);
    }

    @PostMapping(value = "/updateLocation")
    public void updateLocation(@RequestBody LocationRequest locationRequest) {
        locationService.updateLocation(locationRequest);
    }

    @DeleteMapping(value = "/deleteById/{locationID}")
    public void deleteById(@PathVariable(value = "locationID") Long locationID) {
        locationService.deleteById(locationID);
    }

}
