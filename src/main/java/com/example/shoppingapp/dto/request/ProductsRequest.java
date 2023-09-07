package com.example.shoppingapp.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductsRequest {
    private Long productsId;
    private String productName;
    private String description;
    private String standardCost;
    private String listPrice;
}
