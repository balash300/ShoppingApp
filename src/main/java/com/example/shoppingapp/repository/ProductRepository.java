package com.example.shoppingapp.repository;

import com.example.shoppingapp.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Products, Long> {

    List<Products> getProductsByProductID(Long productID);

}
