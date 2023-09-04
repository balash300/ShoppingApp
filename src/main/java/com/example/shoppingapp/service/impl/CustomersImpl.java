package com.example.shoppingapp.service.impl;

import com.example.shoppingapp.dto.CustomersDto;
import com.example.shoppingapp.dto.request.CustomersRequest;
import com.example.shoppingapp.model.Customers;
import com.example.shoppingapp.repository.CustomersRepository;
import com.example.shoppingapp.service.CustomersServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class CustomersImpl implements CustomersServices {

    private final CustomersRepository customersRepository;
    @Override
    public CustomersDto getCustomersByCustomersId(Long customersId) {
        Customers customers = customersRepository.getCustomersByCustomersId(customersId);
        return CustomersDto.builder()
                .name(customers.getName())
                .website(customers.getWebsite())
                .creditLimit(customers.getCreditLimit())
                .build();
    }

    @Override
    public void saveCustomers(CustomersRequest customersRequest) {
        Customers customers = Customers.builder()
                .name(customersRequest.getName())
                .address(customersRequest.getAddress())
                .website(customersRequest.getWebsite())
                .build();

        customersRepository.save(customers);

    }

    @Override
    public void updateCustomers(CustomersRequest customersRequest) {
        Customers customers = Customers.builder()
                .name(customersRequest.getName())
                .address(customersRequest.getAddress())
                .website(customersRequest.getWebsite())
                .creditLimit(customersRequest.getCreditLimit())
                .build();

        customersRepository.save(customers);

    }

    @Override
    public void deleteByCustomersId(Long customersId) {
        if (customersId == null){
            throw new RuntimeException("There is no such information");
        } else {
            customersRepository.deleteById(customersId);
        }
    }

    @Override
    public List<CustomersDto> getAll() {
        List<Customers> customers1 = customersRepository.findAll();
        List<CustomersDto> customersDtos = new ArrayList<>();

        for (Customers customers : customers1){
            CustomersDto customersDto = CustomersDto.builder()
                    .name(customers.getName())
                    .website(customers.getWebsite())
                    .creditLimit(customers.getCreditLimit())
                    .build();

            customersDtos.add(customersDto);
        }
        return customersDtos;
    }
}
