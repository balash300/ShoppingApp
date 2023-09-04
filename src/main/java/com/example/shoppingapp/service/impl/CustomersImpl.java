package com.example.shoppingapp.service.impl;

import com.example.shoppingapp.dto.CustomersDto;
import com.example.shoppingapp.dto.request.CustomersRequest;
import com.example.shoppingapp.service.CustomersServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomersImpl implements CustomersServices {
    @Override
    public CustomersDto getCustomersByCustomersId(Long customersId) {
        return null;
    }

    @Override
    public void saveCustomers(CustomersRequest customersRequest) {

    }

    @Override
    public void updateCustomers(CustomersRequest customersRequest) {

    }

    @Override
    public void deleteByCustomersId(Long customersId) {

    }

    @Override
    public List<CustomersDto> getAll() {
        return null;
    }
}
