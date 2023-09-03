package com.example.shoppingapp.service;

import com.example.shoppingapp.dto.ProductDto;
import com.example.shoppingapp.dto.request.ProductRequest;

import java.util.List;

public interface ProductService {

    ProductDto getProductsByProductID(Long productID);

    void saveProduct(ProductRequest productRequest);

    void updateProduct(ProductRequest productRequest);

    void deleteById(Long id);

    List<ProductDto> getAll();

}
