package com.example.inventoryManagementSystem.Service;

import com.example.inventoryManagementSystem.Repository.PurchaseOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// OrderService.java
@Service
public class PurchaseOrderService {
    @Autowired
    private PurchaseOrderRepository orderRepository;

    // Add methods for order management
}
