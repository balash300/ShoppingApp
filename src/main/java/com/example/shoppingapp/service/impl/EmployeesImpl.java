package com.example.shoppingapp.service.impl;

import com.example.shoppingapp.dto.EmployeesDto;
import com.example.shoppingapp.dto.request.EmployeesRequest;
import com.example.shoppingapp.service.EmployeesServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeesImpl implements EmployeesServices {
    @Override
    public EmployeesDto getEmployeesByEmployeesId(Long employeesId) {
        return null;
    }

    @Override
    public void saveEmployees(EmployeesRequest employeesRequest) {

    }

    @Override
    public void updateEmployees(EmployeesRequest employeesRequest) {

    }

    @Override
    public void deleteByEmployeesId(Long employeesId) {

    }

    @Override
    public List<EmployeesDto> getAll() {
        return null;
    }
}
