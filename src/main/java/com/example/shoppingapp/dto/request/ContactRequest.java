package com.example.shoppingapp.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class ContactRequest {
    private Long contactId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
}
