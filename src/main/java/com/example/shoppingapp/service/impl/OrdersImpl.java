package com.example.shoppingapp.service.impl;

import com.example.shoppingapp.dto.OrdersDto;
import com.example.shoppingapp.dto.request.OrdersRequest;
import com.example.shoppingapp.service.OrdersServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdersImpl implements OrdersServices {
    @Override
    public OrdersDto getOrdersByOrdersId(Long ordersId) {
        return null;
    }

    @Override
    public void saveOrders(OrdersRequest ordersRequest) {

    }

    @Override
    public void updateOrders(OrdersRequest ordersRequest) {

    }

    @Override
    public void deleteByOrdersId(Long ordersId) {

    }

    @Override
    public List<OrdersDto> getAll() {
        return null;
    }
}
