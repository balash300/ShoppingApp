package com.example.shoppingapp.service.impl;

import com.example.shoppingapp.dto.RegionDto;
import com.example.shoppingapp.dto.request.RegionRequest;
import com.example.shoppingapp.model.Regions;
import com.example.shoppingapp.repository.RegionRepository;
import com.example.shoppingapp.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class RegionImpl implements RegionService {

    private final RegionRepository regionRepository;

    @Override
    public RegionDto getRegionsByRegionID(Long regionID) {
        Regions regions = regionRepository.getRegionsByRegionID(regionID);
        return RegionDto.builder()
                .regionName(regions.getRegionName())
                .build();
    }

    @Override
    public void saveRegion(RegionRequest regionRequest) {
        Regions regions = Regions.builder()
                .regionName(regionRequest.getRegionName())
                .build();
        regionRepository.save(regions);
    }

    @Override
    public void updateRegion(RegionRequest regionRequest) {
        Regions regions = Regions.builder()
                .regionID(regionRequest.getRegionID())
                .regionName(regionRequest.getRegionName())
                .build();
        regionRepository.save(regions);
    }

    @Override
    public void deleteById(Long regionID) {
        if (regionID == null) {
            throw new RuntimeException("There is no such information");
        } else {
            regionRepository.deleteById(regionID);
        }
    }

    @Override
    public List<RegionDto> getAll() {
        List<Regions> regions = regionRepository.findAll();
        List<RegionDto> regionDtos = new ArrayList<>();

        for (Regions region : regions) {
            RegionDto regionDto = RegionDto.builder()
                    .regionName(region.getRegionName())
                    .build();
            regionDtos.add(regionDto);
        }

        return regionDtos;
    }
}
