package com.example.inventoryManagementSystem.Repository;

import com.example.inventoryManagementSystem.model.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

// StockRepository.java
public interface StockRepository extends JpaRepository<Stock, Long> {

}