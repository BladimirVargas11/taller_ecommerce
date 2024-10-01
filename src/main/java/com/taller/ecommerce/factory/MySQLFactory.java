package com.taller.ecommerce.factory;

import com.taller.ecommerce.model.MySQLProduct;
import com.taller.ecommerce.model.Product;
import com.taller.ecommerce.repository.MySQLDAO;
import com.taller.ecommerce.repository.ProductRepository;

public class MySQLFactory implements ProductFactory {
    @Override
    public Product createProduct(String id, String description, float price) {
        return new MySQLProduct(id, description, price);
    }

    @Override
    public ProductRepository createDAO() {
        return new MySQLDAO();
    }
}
