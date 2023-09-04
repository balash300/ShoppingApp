package com.example.shoppingapp.repository;

import com.example.shoppingapp.model.Employees;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeesRepository extends JpaRepository<Employees, Long> {
    Employees getEmployeesByEmployeesId(Long employeesId);
}
