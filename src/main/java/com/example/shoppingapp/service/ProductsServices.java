package com.example.shoppingapp.service;

import com.example.shoppingapp.dto.ProductsDto;
import com.example.shoppingapp.dto.request.ProductsRequest;
import com.example.shoppingapp.model.Products;

import java.util.List;

public interface ProductsServices {
    ProductsDto getProductsByProductsId(Long productsId);

    void saveProducts(ProductsRequest productsRequest);

    void updateProducts(ProductsRequest productsRequest);

    void deleteByProductsId(Long productsId);

    List<ProductsDto> getAll();
}
