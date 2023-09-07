package com.example.shoppingapp.service.impl;

import com.example.shoppingapp.dto.ProductCategoriesDto;
import com.example.shoppingapp.dto.request.ProductCategoriesRequest;
import com.example.shoppingapp.model.ProductCategories;
import com.example.shoppingapp.repository.ProductCategoriesRepository;
import com.example.shoppingapp.service.ProductCategoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ProductCategoriesImpl implements ProductCategoriesService {

    private final ProductCategoriesRepository categoriesRepository;

    @Override
    public ProductCategoriesDto getProductCategoriesByCategoryID(Long categoryID) {
        ProductCategories categories = categoriesRepository.getProductCategoriesByCategoryID(categoryID);
        return ProductCategoriesDto.builder()
                .categoryName(categories.getCategoryName())
                .build();
    }

    @Override
    public void saveProductCategories(ProductCategoriesRequest categoriesRequest) {
        ProductCategories categories = ProductCategories.builder()
                .categoryName(categoriesRequest.getCategoryName())
                .build();
        categoriesRepository.save(categories);
    }

    @Override
    public void updateProductCategories(ProductCategoriesRequest categoriesRequest) {
        ProductCategories categories = ProductCategories.builder()
                .categoryID(categoriesRequest.getCategoryID())
                .categoryName(categoriesRequest.getCategoryName())
                .build();
        categoriesRepository.save(categories);
    }

    @Override
    public void deleteById(Long categoryID) {
        if (categoryID == null) {
            throw new RuntimeException("There is no such information");
        } else {
            categoriesRepository.deleteById(categoryID);
        }
    }

    @Override
    public List<ProductCategoriesDto> getAll() {
        List<ProductCategories> categories = categoriesRepository.findAll();
        List<ProductCategoriesDto> categoriesDtos = new ArrayList<>();

        for (ProductCategories category : categories) {
            ProductCategoriesDto categoriesDto = ProductCategoriesDto.builder()
                    .categoryName(category.getCategoryName())
                    .build();
            categoriesDtos.add(categoriesDto);
        }
        return categoriesDtos;
    }
}
