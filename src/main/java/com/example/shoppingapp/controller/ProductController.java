package com.example.shoppingapp.controller;

import com.example.shoppingapp.dto.ProductDto;
import com.example.shoppingapp.dto.request.ProductRequest;
import com.example.shoppingapp.service.ProductService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/products")
public class ProductController {

    private ProductService productService;

    @GetMapping(value = "/productList")
    public List<ProductDto> getProductInfo() {
        return productService.getAll();
    }

    @GetMapping(value = "/getProductsByProductID/{productID}")
    public ProductDto getProductsByProductID(@PathVariable(value = "productI") Long productID) {
        return getProductsByProductID(productID);
    }

    @PostMapping(value = "/saveProduct")
    public void saveProduct(@RequestBody ProductRequest productRequest) {
        productService.saveProduct(productRequest);
    }

    @PostMapping(value = "/updateProduct")
    public void updateProduct(@RequestBody ProductRequest productRequest) {
        productService.updateProduct(productRequest);
    }

    @DeleteMapping(value = "/deleteById/{productID}")
    public void deleteById(@PathVariable(value = "productI") Long productID) {
        productService.deleteById(productID);
    }

}
