package com.example.inventoryManagementSystem.Controller;

import com.example.inventoryManagementSystem.Service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// StockController.java
@RestController
@RequestMapping("/api/stock")
public class StockController {
    @Autowired
    private StockService stockService;

    // Add methods for stock endpoints
}