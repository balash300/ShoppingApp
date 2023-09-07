package com.example.shoppingapp.service;

import com.example.shoppingapp.dto.EmployeesDto;
import com.example.shoppingapp.dto.request.EmployeesRequest;
import com.example.shoppingapp.model.Employees;

import java.util.List;

public interface EmployeesServices {

    EmployeesDto getEmployeesByEmployeesId(Long employeesId);

    void saveEmployees(EmployeesRequest employeesRequest);

    void updateEmployees(EmployeesRequest employeesRequest);

    void deleteByEmployeesId(Long employeesId);

    List<EmployeesDto> getAll();
}
