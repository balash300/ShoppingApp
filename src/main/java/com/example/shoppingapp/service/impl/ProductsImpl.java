package com.example.shoppingapp.service.impl;

import com.example.shoppingapp.dto.ProductsDto;
import com.example.shoppingapp.dto.request.ProductsRequest;
import com.example.shoppingapp.model.Products;
import com.example.shoppingapp.repository.ProductsRepository;
import com.example.shoppingapp.service.ProductsServices;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductsImpl implements ProductsServices {
    private final ProductsRepository productsRepository;
    @Override
    public ProductsDto getProductsByProductsId(Long productsId) {
        Products products = productsRepository.getProductsByProductsId(productsId);
        return ProductsDto.builder()
                .productName(products.getProductName())
                .description(products.getDescription())
                .listPrice(products.getListPrice())
                .build();
    }

    @Override
    public void saveProducts(ProductsRequest productsRequest) {
        Products products = Products.builder()
                .productName(productsRequest.getProductName())
                .description(productsRequest.getDescription())
                .standardCost(productsRequest.getStandardCost())
                .build();

        productsRepository.save(products);

    }

    @Override
    public void updateProducts(ProductsRequest productsRequest) {
        Products products = Products.builder()
                .productName(productsRequest.getProductName())
                .description(productsRequest.getDescription())
                .standardCost(productsRequest.getStandardCost())
                .listPrice(productsRequest.getListPrice())
                .build();

        productsRepository.save(products);
    }

    @Override
    public void deleteByProductsId(Long productsId) {
        if (productsId == null){
            throw new RuntimeException("There is no such information");
        } else {
            productsRepository.deleteById(productsId);
        }
    }

    @Override
    public List<ProductsDto> getAll() {
        List<Products> products1 = productsRepository.findAll();
        List<ProductsDto> productsDtos = new ArrayList<>();

        for (Products products : products1){
            ProductsDto productsDto = ProductsDto.builder()
                    .productName(products.getProductName())
                    .description(products.getDescription())
                    .listPrice(products.getListPrice())
                    .build();

            productsDtos.add(productsDto);
        }
        return productsDtos;
    }
}
