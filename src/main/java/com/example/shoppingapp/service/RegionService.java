package com.example.shoppingapp.service;

import com.example.shoppingapp.dto.RegionDto;
import com.example.shoppingapp.dto.request.RegionRequest;

import java.util.List;

public interface RegionService {

    RegionDto getRegionsByRegionID(Long regionID);

    void saveRegion(RegionRequest regionRequest);

    void updateRegion(RegionRequest regionRequest);

    void deleteById(Long regionID);

    List<RegionDto> getAll();

}
