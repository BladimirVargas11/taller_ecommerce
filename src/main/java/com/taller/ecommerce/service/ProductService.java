package com.taller.ecommerce.service;

import com.taller.ecommerce.model.Product;

import java.util.List;

public interface ProductService {
    void addProduct(Product product);
    List<Product> getAllProducts();
    Product getProduct(String id);
    void updateProduct(Product product);
    void removeProduct(String id);


}
