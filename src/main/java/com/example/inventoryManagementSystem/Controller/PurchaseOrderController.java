package com.example.inventoryManagementSystem.Controller;

import com.example.inventoryManagementSystem.Service.PurchaseOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// OrderController.java
@RestController
@RequestMapping("/api/orders")
public class PurchaseOrderController {
    @Autowired
    private PurchaseOrderService orderService;

    // Add methods for order endpoints
}