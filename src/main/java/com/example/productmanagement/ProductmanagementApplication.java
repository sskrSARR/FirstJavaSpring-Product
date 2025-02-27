package com.example.productmanagement;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.example.productmanagement")
public class ProductmanagementApplication {
    public static void main(String[] args) {
        SpringApplication.run(ProductmanagementApplication.class, args);
    }
}
