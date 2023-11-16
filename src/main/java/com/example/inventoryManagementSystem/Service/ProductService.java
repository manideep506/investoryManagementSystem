package com.example.inventoryManagementSystem.Service;

import com.example.inventoryManagementSystem.Repository.ProductRepository;
import com.example.inventoryManagementSystem.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

// ProductService.java
@Service
public class ProductService {
    @Autowired
    private ProductRepository productRepository;

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    // Add other methods for product management
}