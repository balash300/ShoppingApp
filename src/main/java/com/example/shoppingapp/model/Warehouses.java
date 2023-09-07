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
@Table(name = "warehouses")
public class Warehouses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "warehouse_id")
    private Long warehouseID;
    @Column(name = "warehouse_name")
    @NotBlank
    private String warehouseName;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "location_id")
    private Locations locations;

    @OneToMany(mappedBy = "warehouses", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Inventories> inventorieses = new ArrayList<>();

}
