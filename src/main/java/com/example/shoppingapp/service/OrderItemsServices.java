package com.example.shoppingapp.service;

import com.example.shoppingapp.dto.OrderItemsDto;
import com.example.shoppingapp.dto.request.OrderItemsRequest;
import com.example.shoppingapp.model.OrderItems;

import java.util.List;

public interface OrderItemsServices {

    OrderItemsDto getOrderItemsByOrderItemsId(Long orderItemsId);

    void saveOrderItems(OrderItemsRequest orderItemsRequest);

    void updateOrderItems(OrderItemsRequest orderItemsRequest);

    void deleteByOrderItemsId(Long orderItemsId);

    List<OrderItemsDto> getAll();
}
