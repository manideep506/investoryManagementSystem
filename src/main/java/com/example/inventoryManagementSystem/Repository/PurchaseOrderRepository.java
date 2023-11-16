package com.example.inventoryManagementSystem.Repository;

import com.example.inventoryManagementSystem.model.PurchaseOrder;
import org.springframework.data.jpa.repository.JpaRepository;

// OrderRepository.java
public interface PurchaseOrderRepository extends JpaRepository<PurchaseOrder, Long> {

}