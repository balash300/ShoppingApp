package com.example.shoppingapp.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class InventoriesRequest {
    private Long id;
    private ProductRequest productsID;
    private WarehousesRequest warehousesID;
    private Long quantity;
}
