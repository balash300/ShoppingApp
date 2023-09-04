package com.example.shoppingapp.repository;

import com.example.shoppingapp.model.Products;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductsRepository extends JpaRepository<Products, Long> {
    Products getProductsByProductsId(Long productsId);
}
