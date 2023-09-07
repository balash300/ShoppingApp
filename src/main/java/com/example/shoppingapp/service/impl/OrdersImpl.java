package com.example.shoppingapp.service.impl;

import com.example.shoppingapp.dto.OrdersDto;
import com.example.shoppingapp.dto.request.OrdersRequest;
import com.example.shoppingapp.model.Orders;
import com.example.shoppingapp.repository.OrdersRepository;
import com.example.shoppingapp.service.OrdersServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrdersImpl implements OrdersServices {
    final private OrdersRepository ordersRepository;
    @Override
    public OrdersDto getOrdersByOrdersId(Long ordersId) {
        Orders orders = ordersRepository.getOrdersByOrdersId(ordersId);
        return OrdersDto.builder()
                .status(orders.getStatus())
                .orderdate(orders.getOrderdate())
                .build();
    }

    @Override
    public void saveOrders(OrdersRequest ordersRequest) {
        Orders orders = Orders.builder()
                .status(ordersRequest.getStatus())
                .orderdate(ordersRequest.getOrderdate())
                .build();

        ordersRepository.save(orders);

    }

    @Override
    public void updateOrders(OrdersRequest ordersRequest) {
        Orders orders = Orders.builder()
                .status(ordersRequest.getStatus())
                .orderdate(ordersRequest.getOrderdate())
                .build();

        ordersRepository.save(orders);

    }

    @Override
    public void deleteByOrdersId(Long ordersId) {
        if (ordersId == null){
            throw new RuntimeException("There is no such information");
        } else {
            ordersRepository.deleteById(ordersId);
        }
    }

    @Override
    public List<OrdersDto> getAll() {
        List<Orders> orders1 = ordersRepository.findAll();
        List<OrdersDto> ordersDtos = new ArrayList<>();

        for (Orders orders : orders1){
            OrdersDto ordersDto = OrdersDto.builder()
                    .status(orders.getStatus())
                    .orderdate(orders.getOrderdate())
                    .build();

            ordersDtos.add(ordersDto);
        }
        return ordersDtos;
    }
}
