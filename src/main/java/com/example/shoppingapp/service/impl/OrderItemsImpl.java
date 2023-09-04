package com.example.shoppingapp.service.impl;

import com.example.shoppingapp.dto.OrderItemsDto;
import com.example.shoppingapp.dto.request.OrderItemsRequest;
import com.example.shoppingapp.service.OrderItemsServices;
import com.example.shoppingapp.service.OrdersServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderItemsImpl implements OrderItemsServices {
    @Override
    public OrderItemsDto getOrderItemsByOrderItemsId(Long orderItemsId) {
        return null;
    }

    @Override
    public void saveOrderItems(OrderItemsRequest orderItemsRequest) {

    }

    @Override
    public void updateOrderItems(OrderItemsRequest orderItemsRequest) {

    }

    @Override
    public void deleteByOrderItemsId(Long orderItemsId) {

    }

    @Override
    public List<OrderItemsDto> getAll() {
        return null;
    }
}
