package com.example.inventoryManagementSystem.model;

import jakarta.persistence.*;
import lombok.Data;

// Stock.java
@Data
@Entity
public class Stock {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Product product;
    private int quantity;
}