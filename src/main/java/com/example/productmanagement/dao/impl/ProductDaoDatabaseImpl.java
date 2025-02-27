package com.example.productmanagement.dao.impl;

import com.example.productmanagement.dao.ProductDao;
import com.example.productmanagement.model.Product;
import com.example.productmanagement.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Repository("databaseDao")
@Service
public class ProductDaoDatabaseImpl implements ProductDao {

    private final ProductRepository productRepository;

    @Autowired
    public ProductDaoDatabaseImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void addProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    @Override
    public List<Product> searchProducts(String keyword) {
        return productRepository.findByDesignationContainingIgnoreCase(keyword);
    }

    @Override
    public Optional<Product> getProductByReference(Long id) {
        return productRepository.findById(id);
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.save(product);
    }

    @Override
    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
