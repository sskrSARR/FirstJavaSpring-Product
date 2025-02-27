package com.example.productmanagement.service;

import com.example.productmanagement.dao.ProductDao;
import com.example.productmanagement.model.Product;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProductService {
    private final ProductDao productDao;

    public ProductService(@Qualifier("databaseDao") ProductDao productDao) {
        this.productDao = productDao; // Injecter HashMapDao ou DatabaseDao en changeant ici
    }

    public void addProduct(Product product) {
        productDao.addProduct(product);
    }

    public List<Product> getAllProducts() {
        return productDao.getAllProducts();
    }

    public List<Product> searchProducts(String keyword) {
        return productDao.searchProducts(keyword);
    }

    public Optional<Product> getProductByReference(Long id) {
        return productDao.getProductByReference(id);
    }

    public void updateProduct(Product product) {
        productDao.updateProduct(product);
    }

    public void deleteProduct(Long id) {
        productDao.deleteProduct(id);
    }
}
