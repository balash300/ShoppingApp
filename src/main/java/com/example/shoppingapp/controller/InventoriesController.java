package com.example.shoppingapp.controller;

import com.example.shoppingapp.dto.InventoriesDto;
import com.example.shoppingapp.dto.request.InventoriesRequest;
import com.example.shoppingapp.service.InventoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/inventories")
public class InventoriesController {

    final InventoriesService inventoriesService;

    @GetMapping(value = "/inventoriesList")
    public List<InventoriesDto> getInventoriesInfo() {
        return inventoriesService.getAll();
    }

    @GetMapping(value = "/getInventoriesById/{id}")
    public InventoriesDto getInventoriesById(@PathVariable(value = "id") Long id) {
        return getInventoriesById(id);
    }

    @PostMapping(value = "/saveInventories")
    public void saveInventories(@RequestBody InventoriesRequest inventoriesRequest) {
        inventoriesService.saveInventories(inventoriesRequest);
    }

    @PostMapping(value = "/updateInventories")
    public void updateInventories(@RequestBody InventoriesRequest inventoriesRequest) {
        inventoriesService.updateInventories(inventoriesRequest);
    }

    @DeleteMapping(value = "/deleteById/{id}")
    public void deleteById(@PathVariable(value = "id") Long id) {
        inventoriesService.deleteById(id);
    }

}
