package com.taller.ecommerce.repository;

import com.taller.ecommerce.model.Product;

public interface ProductRepository {
    void createProduct(Product product);
    Product readProduct(String id);
    void updateProduct(Product product);
    void deleteProduct(String id);
}