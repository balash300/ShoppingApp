package com.example.shoppingapp.service.impl;

import com.example.shoppingapp.dto.EmployeesDto;
import com.example.shoppingapp.dto.request.EmployeesRequest;
import com.example.shoppingapp.model.Employees;
import com.example.shoppingapp.repository.EmployeesRepository;
import com.example.shoppingapp.service.EmployeesServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class EmployeesImpl implements EmployeesServices {
    private final EmployeesRepository employeesRepository;
    @Override
    public EmployeesDto getEmployeesByEmployeesId(Long employeesId) {
        Employees employees = employeesRepository.getEmployeesByEmployeesId(employeesId);
        return EmployeesDto.builder()
                .firstName(employees.getFirstName())
                .lastName(employees.getLastName())
                .email(employees.getEmail())
                .hireDate(employees.getHireDate())
                .build();
    }

    @Override
    public void saveEmployees(EmployeesRequest employeesRequest) {
        Employees employees = Employees.builder()
                .firstName(employeesRequest.getFirstName())
                .email(employeesRequest.getEmail())
                .hireDate(employeesRequest.getHireDate())
                .jobTitle(employeesRequest.getJobTitle())
                .build();

        employeesRepository.save(employees);

    }

    @Override
    public void updateEmployees(EmployeesRequest employeesRequest) {
        Employees employees = Employees.builder()
                .firstName(employeesRequest.getFirstName())
                .lastName(employeesRequest.getLastName())
                .email(employeesRequest.getEmail())
                .phone(employeesRequest.getPhone())
                .hireDate(employeesRequest.getHireDate())
                .jobTitle(employeesRequest.getJobTitle())
                .build();

        employeesRepository.save(employees);

    }

    @Override
    public void deleteByEmployeesId(Long employeesId) {
        if (employeesId == null) {
            throw new RuntimeException("There is no such information");
        } else {
            employeesRepository.deleteById(employeesId);
        }
    }

    @Override
    public List<EmployeesDto> getAll() {

        List<Employees> employees1 = employeesRepository.findAll();
        List<EmployeesDto> employeesDtos = new ArrayList<>();

        for (Employees employees : employees1){
            EmployeesDto employeesDto = EmployeesDto.builder()
                    .firstName(employees.getFirstName())
                    .lastName(employees.getLastName())
                    .email(employees.getEmail())
                    .hireDate(employees.getHireDate())
                    .build();

            employeesDtos.add(employeesDto);
        }
        return employeesDtos;
    }
}
