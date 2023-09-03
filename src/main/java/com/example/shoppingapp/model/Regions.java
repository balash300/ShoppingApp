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
@Table(name = "regions")
public class Regions {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "region_id", nullable = false)
    private Long regionID;
    @Column(name = "region_name")
    @NotBlank
    private String regionName;

    @OneToMany(mappedBy = "regions", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Countries> countrieses = new ArrayList<>();

}
