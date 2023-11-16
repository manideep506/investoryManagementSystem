package com.example.inventoryManagementSystem.Service;

import com.example.inventoryManagementSystem.Repository.StockRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// StockService.java
@Service
public class StockService {
    @Autowired
    private StockRepository stockRepository;

    // Add methods for stock management
}
