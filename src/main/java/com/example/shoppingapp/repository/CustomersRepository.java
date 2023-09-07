package com.example.shoppingapp.repository;

import com.example.shoppingapp.model.Customers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomersRepository extends JpaRepository<Customers,Long> {
    Customers getCustomersByCustomersId(Long customersId);
}
