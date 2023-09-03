package com.example.shoppingapp.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ProductRequest {
    private Long productID;
    private String productName;
    private String description;
    private String standardCost;
    private Long listPrice;
}
