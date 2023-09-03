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
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "product_categories")
public class ProductCategories {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "category_id", nullable = false)
    private Long categoryID;
    @Column(name = "category_name")
    @NotBlank
    private String categoryName;

    @OneToMany(mappedBy = "productCategories", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Products> productses = new ArrayList<>();

}
