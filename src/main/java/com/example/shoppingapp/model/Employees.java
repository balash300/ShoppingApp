package com.example.shoppingapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;

@Entity
@Data
@Table(name = "employees")
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Employees {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employees_id", nullable = false)
    private Long employeesId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private Date hireDate;
    private String jobTitle;
}
