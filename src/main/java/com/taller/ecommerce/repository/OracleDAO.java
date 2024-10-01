package com.taller.ecommerce.repository;

import com.taller.ecommerce.model.Product;

import java.util.HashMap;
import java.util.Map;

public class OracleDAO implements ProductRepository {
    private Map<String, Product> database = new HashMap<>();

    @Override
    public void createProduct(Product product) {
        database.put(product.getId(), product);
    }

    @Override
    public Product readProduct(String id) {
        return database.get(id);
    }

    @Override
    public void updateProduct(Product product) {
        database.put(product.getId(), product);
    }

    @Override
    public void deleteProduct(String id) {
        database.remove(id);
    }
}
