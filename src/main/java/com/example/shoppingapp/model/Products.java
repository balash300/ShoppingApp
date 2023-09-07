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
@Table(name = "products")
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id", nullable = false)
    private Long productID;
    @Column(name = "product_name")
    @NotBlank
    private String productName;
    @NotBlank
    private String description;
    @Column(name = "standard_cost")
    @NotBlank
    private String standardCost;
    @Column(name = "list_price")
    @NotBlank
    private Long listPrice;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "category_id")
    private ProductCategories productCategories;

    @OneToMany(mappedBy = "products", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Inventories> inventorieses = new ArrayList<>();

}
