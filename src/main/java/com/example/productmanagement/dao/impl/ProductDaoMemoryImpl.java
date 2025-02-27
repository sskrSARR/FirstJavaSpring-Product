package com.example.productmanagement.dao.impl;

import com.example.productmanagement.dao.ProductDao;
import com.example.productmanagement.model.Product;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository("memoryDao")
public class ProductDaoMemoryImpl implements ProductDao {
    private final Map<String, Product> products = new HashMap<>();

    @Override
    public void addProduct(Product product) {
        products.put(product.getReference(), product);
    }

    @Override
    public List<Product> getAllProducts() {
        return new ArrayList<>(products.values());
    }

    @Override
    public List<Product> searchProducts(String keyword) {
        return products.values().stream()
                .filter(p -> p.getDesignation().toLowerCase().contains(keyword.toLowerCase()))
                .toList();
    }

    @Override
    public Optional<Product> getProductByReference(Long id) {
        return Optional.ofNullable(products.get(id));
    }

    @Override
    public void updateProduct(Product product) {
        products.put(product.getReference(), product);
    }

    @Override
    public void deleteProduct(Long id) {
        products.remove(id);
    }
}
