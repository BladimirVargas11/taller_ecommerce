package com.taller.ecommerce.factory;

import com.taller.ecommerce.model.Product;
import com.taller.ecommerce.repository.ProductRepository;

public interface ProductFactory {
    Product createProduct(String id, String description, float price);
    ProductRepository createDAO();
}
