package com.example.shoppingapp.service.impl;

import com.example.shoppingapp.dto.ProductsDto;
import com.example.shoppingapp.dto.request.ProductsRequest;
import com.example.shoppingapp.service.ProductsServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductsImpl implements ProductsServices {
    @Override
    public ProductsDto getProductsByProductsId(Long productsId) {
        return null;
    }

    @Override
    public void saveProducts(ProductsRequest productsRequest) {

    }

    @Override
    public void updateProducts(ProductsRequest productsRequest) {

    }

    @Override
    public void deleteByProductsId(Long productsId) {

    }

    @Override
    public List<ProductsDto> getAll() {
        return null;
    }
}
