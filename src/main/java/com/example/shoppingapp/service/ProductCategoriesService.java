package com.example.shoppingapp.service;

import com.example.shoppingapp.dto.ProductCategoriesDto;
import com.example.shoppingapp.dto.request.ProductCategoriesRequest;

import java.util.List;

public interface ProductCategoriesService {

    ProductCategoriesDto getProductCategoriesByCategoryID(Long categoryID);

    void saveProductCategories(ProductCategoriesRequest categoriesRequest);

    void updateProductCategories(ProductCategoriesRequest categoriesRequest);

    void deleteById(Long categoryID);

    List<ProductCategoriesDto> getAll();

}
