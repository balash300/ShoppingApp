package com.example.shoppingapp.repository;

import com.example.shoppingapp.model.ProductCategories;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductCategoriesRepository extends JpaRepository<ProductCategories, Long> {

    ProductCategories getProductCategoriesByCategoryID(Long categoryID);

}
