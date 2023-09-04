package com.example.shoppingapp.service;

import com.example.shoppingapp.dto.OrdersDto;
import com.example.shoppingapp.dto.request.OrdersRequest;
import com.example.shoppingapp.model.Orders;

import java.util.List;

public interface OrdersServices {
    OrdersDto getOrdersByOrdersId(Long ordersId);

    void saveOrders(OrdersRequest ordersRequest);

    void updateOrders(OrdersRequest ordersRequest);

    void deleteByOrdersId(Long ordersId);

    List<OrdersDto> getAll();
}
