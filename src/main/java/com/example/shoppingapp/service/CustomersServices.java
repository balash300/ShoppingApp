package com.example.shoppingapp.service;

import com.example.shoppingapp.dto.CustomersDto;
import com.example.shoppingapp.dto.request.CustomersRequest;
import com.example.shoppingapp.model.Customers;

import java.util.List;

public interface CustomersServices {
    CustomersDto getCustomersByCustomersId(Long customersId);

    void saveCustomers(CustomersRequest customersRequest);

    void updateCustomers(CustomersRequest customersRequest);

    void deleteByCustomersId(Long customersId);

    List<CustomersDto> getAll();

}
