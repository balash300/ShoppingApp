package com.example.shoppingapp.controller;

import com.example.shoppingapp.dto.OrdersDto;
import com.example.shoppingapp.dto.request.OrdersRequest;
import com.example.shoppingapp.service.OrdersServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/orders")
public class OrdersController {
    final OrdersServices ordersServices;

    @GetMapping(value = "/ordersList")
    public List<OrdersDto> getOrdersInfo(){return ordersServices.getAll();}

    @GetMapping(value = "/getOrdersByOrdersId/{ordersId}")
    public OrdersDto getOrdersByOrdersId(@PathVariable(value = "ordersId") Long ordersId){
        return getOrdersByOrdersId(ordersId);
    }

    @PostMapping(value = "/saveOrders")
    public void saveOrders(@RequestBody OrdersRequest ordersRequest){
        ordersServices.saveOrders(ordersRequest);
    }

    @PostMapping(value = "/updateOrders")
    public void updateOrders(@RequestBody OrdersRequest ordersRequest){
        ordersServices.updateOrders(ordersRequest);
    }

    @DeleteMapping(value = "/deleteByOrdersId/{ordersId}")
    public void deleteByOrdersId(@PathVariable(value = "ordersId") Long ordersId){
        ordersServices.deleteByOrdersId(ordersId);
    }
}
