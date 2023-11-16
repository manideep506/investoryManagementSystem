package com.example.inventoryManagementSystem.Repository;

import com.example.inventoryManagementSystem.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {

}