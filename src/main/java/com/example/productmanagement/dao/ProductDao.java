package com.example.productmanagement.dao;

import com.example.productmanagement.model.Product;
import java.util.List;
import java.util.Optional;

public interface ProductDao {
    void addProduct(Product product);
    List<Product> getAllProducts();
    List<Product> searchProducts(String keyword);
    Optional<Product> getProductByReference(Long id);
    void updateProduct(Product product);
    void deleteProduct(Long id);
}
