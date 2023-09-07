package com.example.shoppingapp.service.impl;

import com.example.shoppingapp.dto.OrderItemsDto;
import com.example.shoppingapp.dto.request.OrderItemsRequest;
import com.example.shoppingapp.model.OrderItems;
import com.example.shoppingapp.repository.OrderItemsRepository;
import com.example.shoppingapp.service.OrderItemsServices;
import com.example.shoppingapp.service.OrdersServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class OrderItemsImpl implements OrderItemsServices {
    private final OrderItemsRepository orderItemsRepository;
    @Override
    public OrderItemsDto getOrderItemsByOrderItemsId(Long orderItemsId) {
        OrderItems orderItems = orderItemsRepository.getOrderItemsByOrderItemsId(orderItemsId);
        return OrderItemsDto.builder()
                .quantity(orderItems.getQuantity())
                .unitPrice(orderItems.getUnitPrice())
                .build();
    }

    @Override
    public void saveOrderItems(OrderItemsRequest orderItemsRequest) {
        OrderItems orderItems = OrderItems.builder()
                .quantity(orderItemsRequest.getQuantity())
                .unitPrice(orderItemsRequest.getUnitPrice())
                .build();

        orderItemsRepository.save(orderItems);
    }

    @Override
    public void updateOrderItems(OrderItemsRequest orderItemsRequest) {
        OrderItems orderItems = OrderItems.builder()
                .quantity(orderItemsRequest.getQuantity())
                .unitPrice(orderItemsRequest.getUnitPrice())
                .build();

        orderItemsRepository.save(orderItems);
    }

    @Override
    public void deleteByOrderItemsId(Long orderItemsId) {
        if (orderItemsId == null){
            throw new RuntimeException("There is no such information");
        } else {
            orderItemsRepository.deleteById(orderItemsId);
        }
    }

    @Override
    public List<OrderItemsDto> getAll() {
        List<OrderItems> orderItems1 = orderItemsRepository.findAll();
        List<OrderItemsDto> orderItemsDtos = new ArrayList<>();

        for (OrderItems orderItems : orderItems1){
            OrderItemsDto orderItemsDto = OrderItemsDto.builder()
                    .quantity(orderItems.getQuantity())
                    .unitPrice(orderItems.getUnitPrice())
                    .build();

            orderItemsDtos.add(orderItemsDto);
        }
        return orderItemsDtos;
    }
}
