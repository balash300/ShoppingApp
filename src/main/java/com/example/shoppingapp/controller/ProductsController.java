package com.example.shoppingapp.controller;

import com.example.shoppingapp.dto.ProductsDto;
import com.example.shoppingapp.dto.request.ProductsRequest;
import com.example.shoppingapp.service.ProductsServices;
import lombok.Generated;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/products")
public class ProductsController {
    final ProductsServices productsServices;

    @GetMapping(value = "/productsInfo")
    public List<ProductsDto> getProductsInfo(){return productsServices.getAll();}

    @GetMapping(value = "/getProductsByProductsId/{productsId}")
    public ProductsDto getProductsByProductsId(@PathVariable(value = "productsId") Long productsId){
        return getProductsByProductsId(productsId);
    }

    @PostMapping(value = "/saveProducts")
    public void saveProducts(@RequestBody ProductsRequest productsRequest){
        productsServices.saveProducts(productsRequest);
    }

    @PostMapping(value = "/updateProducts")
    public void updateProducts(@RequestBody ProductsRequest productsRequest){
        productsServices.updateProducts(productsRequest);
    }


    @DeleteMapping(value = "/deleteByProductsId/{productsId}")
    public void deleteByProductsId(@PathVariable(value = "productsId") Long productsId){
        productsServices.deleteByProductsId(productsId);
    }
}
