package com.example.shoppingapp.controller;

import com.example.shoppingapp.dto.EmployeesDto;
import com.example.shoppingapp.dto.request.EmployeesRequest;
import com.example.shoppingapp.service.EmployeesServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "employees")
public class EmployeesController {
    final EmployeesServices employeesServices;

    @GetMapping(value = "/employeesInfo")
    public List<EmployeesDto> getEmployeesInfo(){
        return employeesServices.getAll();
    }

    @GetMapping(value = "/getEmployeesByEmployeesId/{employeesId}")
    public EmployeesDto getEmployeesByEmployeesId(@PathVariable(value = "employeesId") Long employeesId){
        return getEmployeesByEmployeesId(employeesId);
    }

    @PostMapping(value = "/saveEmployees")
    public void saveEmployees(@RequestBody EmployeesRequest employeesRequest){
        employeesServices.saveEmployees(employeesRequest);
    }

    @PostMapping(value = "/updateEmployees")
    public void updateEmployees(@RequestBody EmployeesRequest employeesRequest){
        employeesServices.updateEmployees(employeesRequest);
    }

    @DeleteMapping(value = "/deleteByEmployeesId/{employeesId}")
    public void deleteByEmployeesId(@PathVariable(value = "employeesId") Long employeesId){
        employeesServices.deleteByEmployeesId(employeesId);
    }
}
