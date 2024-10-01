package com.taller.ecommerce.service;

import com.taller.ecommerce.model.Product;

public interface ProductService {
    void addProduct(Product product);
    Product getProduct(String id);
    void updateProduct(Product product);
    void removeProduct(String id);
}
