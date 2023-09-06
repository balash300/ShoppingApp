package com.example.shoppingapp.controller;

import com.example.shoppingapp.dto.ProductCategoriesDto;
import com.example.shoppingapp.dto.request.ProductCategoriesRequest;
import com.example.shoppingapp.service.ProductCategoriesService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/product_categories")
public class ProductCategoriesController {

    private ProductCategoriesService categoriesService;

    @GetMapping(value = "/productCategoriesList")
    public List<ProductCategoriesDto> getProductCategoriesInfo() {
        return categoriesService.getAll();
    }

    @GetMapping(value = "/getProductCategoriesByCategoryID/{categoryID}")
    public ProductCategoriesDto getProductCategoriesByCategoryID(@PathVariable(value = "categoryID") Long categoryID) {
        return getProductCategoriesByCategoryID(categoryID);
    }

    @PostMapping(value = "/saveProductCategories")
    public void saveProductCategories(@RequestBody ProductCategoriesRequest categoriesRequest) {
        categoriesService.saveProductCategories(categoriesRequest);
    }

    @PostMapping(value = "/updateProductCategories")
    public void updateProductCategories(@RequestBody ProductCategoriesRequest categoriesRequest) {
        categoriesService.updateProductCategories(categoriesRequest);
    }

    @DeleteMapping(value = "/deleteById/{categoryID}")
    public void deleteById(@PathVariable(value = "categoryID") Long categoryID) {
        categoriesService.deleteById(categoryID);
    }

}
