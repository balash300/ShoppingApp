package com.example.shoppingapp.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "locations")
public class Locations {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "location_id", nullable = false)
    private Long locationID;
    @NotBlank
    private String address;
    @Column(name = "postal_code")
    @NotBlank
    private String postalCode;
    @NotBlank
    private String city;
    @NotBlank
    private String state;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "country_id")
    private Countries countries;

    @OneToMany(mappedBy = "locations", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Warehouses> warehouseses = new ArrayList<>();

}
