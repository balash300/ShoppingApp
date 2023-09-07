package com.example.shoppingapp.controller;

import com.example.shoppingapp.dto.CustomersDto;
import com.example.shoppingapp.dto.request.CustomersRequest;
import com.example.shoppingapp.service.CustomersServices;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "customers")
public class CustomersController {

    final CustomersServices customersServices;

    @GetMapping(value = "/customersList")
    public List<CustomersDto> getCustomersInfo(){return customersServices.getAll();}

    @GetMapping(value = "/getCustomersByCustomersId/{customersId}")
    public CustomersDto getCustomersByCustomersId(@PathVariable(value = "customersId") Long customersId){
        return getCustomersByCustomersId(customersId);
    }

    @PostMapping(value = "/saveCustomers")
    public void saveCustomers(@RequestBody CustomersRequest customersRequest){
        customersServices.saveCustomers(customersRequest);
    }

    @PostMapping(value = "/updateCustomers")
    public void updateCustomers(@RequestBody CustomersRequest customersRequest){
        customersServices.updateCustomers(customersRequest);
    }

    @DeleteMapping(value = "/deleteByCustomersId/{customersId}")
    public void deleteByCustomersId(@PathVariable(value = "customersId") Long customersId){
        customersServices.deleteByCustomersId(customersId);
    }
}
