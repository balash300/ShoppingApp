package com.example.shoppingapp.service.impl;

import com.example.shoppingapp.dto.ProductDto;
import com.example.shoppingapp.dto.request.ProductRequest;
import com.example.shoppingapp.model.Products;
import com.example.shoppingapp.repository.ProductRepository;
import com.example.shoppingapp.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductImpl implements ProductService {

    private final ProductRepository productRepository;

    @Override
    public ProductDto getProductsByProductID(Long productID) {
        Products products = (Products) productRepository.getProductsByProductID(productID);
        return ProductDto.builder()
                .productName(products.getProductName())
                .description(products.getDescription())
                .standardCost(products.getStandardCost())
                .listPrice(products.getListPrice())
                .build();
    }

    @Override
    public void saveProduct(ProductRequest productRequest) {
        Products products = Products.builder()
                .productName(productRequest.getDescription())
                .description(productRequest.getDescription())
                .standardCost(productRequest.getStandardCost())
                .listPrice(productRequest.getListPrice())
                .build();
        productRepository.save(products);
    }

    @Override
    public void updateProduct(ProductRequest productRequest) {
        Products products = Products.builder()
                .productID(productRequest.getProductID())
                .productName(productRequest.getDescription())
                .description(productRequest.getDescription())
                .standardCost(productRequest.getStandardCost())
                .listPrice(productRequest.getListPrice())
                .build();
        productRepository.save(products);
    }

    @Override
    public void deleteById(Long id) {
        Products products = (Products) productRepository.getProductsByProductID(id);
        if ( products.getProductID().equals(null) ) {
            throw new RuntimeException("There is no such information");
        } else {
            productRepository.deleteById(id);
        }
    }

    @Override
    public List<ProductDto> getAll() {
        List<Products> products = productRepository.findAll();
        List<ProductDto> productDtos = new ArrayList<>();

        for (int i = 0; i < products.size(); i++) {
            ProductDto productDto = ProductDto.builder()
                    .productName(products.get(i).getProductName())
                    .description(products.get(i).getDescription())
                    .standardCost(products.get(i).getStandardCost())
                    .listPrice(products.get(i).getListPrice())
                    .build();
            productDtos.add(productDto);
        }

        return productDtos;
    }
}
