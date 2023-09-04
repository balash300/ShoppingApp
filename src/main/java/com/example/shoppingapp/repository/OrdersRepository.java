package com.example.shoppingapp.repository;

import com.example.shoppingapp.model.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrdersRepository extends JpaRepository<Orders, Long> {
    Orders getOrdersByOrdersId(Long ordersId);
}
