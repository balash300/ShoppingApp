package com.example.shoppingapp.controller;

import com.example.shoppingapp.dto.RegionDto;
import com.example.shoppingapp.dto.request.RegionRequest;
import com.example.shoppingapp.service.RegionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/regions")
public class RegionController {

    private RegionService regionService;

    @GetMapping(value = "/regionList")
    public List<RegionDto> getRegionInfo() {
        return regionService.getAll();
    }

    @GetMapping(value = "/getRegionsByRegionID/{regionID}")
    public RegionDto getRegionsByRegionID(@PathVariable(value = "regionID") Long regionID) {
        return getRegionsByRegionID(regionID);
    }

    @PostMapping(value = "/saveRegion")
    public void saveRegion(@RequestBody RegionRequest regionRequest) {
        regionService.saveRegion(regionRequest);
    }

    @PostMapping(value = "/updateRegion")
    public void updateRegion(@RequestBody RegionRequest regionRequest) {
        regionService.updateRegion(regionRequest);
    }

    @DeleteMapping(value = "/deleteById/{regionID}")
    public void deleteById(@PathVariable(value = "regionID") Long regionID) {
        regionService.deleteById(regionID);
    }

}
