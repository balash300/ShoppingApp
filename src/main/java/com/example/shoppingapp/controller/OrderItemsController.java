package com.example.shoppingapp.controller;

import com.example.shoppingapp.dto.OrderItemsDto;
import com.example.shoppingapp.dto.request.OrderItemsRequest;
import com.example.shoppingapp.service.OrderItemsServices;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/orderItems")
public class OrderItemsController {
    final OrderItemsServices orderItemsServices;

    @GetMapping(value = "/orderItemsList")
    public List<OrderItemsDto> getOrderItemsInfo(){
        return orderItemsServices.getAll();
    }

    @GetMapping(value = "/getOrderItemsByOrderItemsId/{orderItemsId}")
    public OrderItemsDto getOrderItemsByOrderItemsId(@PathVariable(value = "orderItemsId") Long orderItemsId){
        return getOrderItemsByOrderItemsId(orderItemsId);
    }

    @PostMapping(value = "/saveOrderItems")
    public void saveOrderItems(@RequestBody OrderItemsRequest orderItemsRequest){
        orderItemsServices.saveOrderItems(orderItemsRequest);
    }

    @PostMapping(value = "/updateOrderItems")
    public void updateOrderItems(@RequestBody OrderItemsRequest orderItemsRequest){
        orderItemsServices.updateOrderItems(orderItemsRequest);
    }

    @DeleteMapping(value = "/deleteByOrderItemsId/{orderItemsId}")
    public void deleteByOrderItemsId(@PathVariable(value = "orderItemsId") Long orderItemsId){
        orderItemsServices.deleteByOrderItemsId(orderItemsId);
    }
}
