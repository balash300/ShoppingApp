package com.example.shoppingapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name = "contacts")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Contacts {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id", nullable = false)
    private Long contactId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;


}
