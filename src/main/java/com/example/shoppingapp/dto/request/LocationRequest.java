package com.example.shoppingapp.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LocationRequest {
    private Long locationID;
    private String address;
    private String postalCode;
    private String city;
    private String state;
}
