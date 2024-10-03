package com.taller.ecommerce.factory;

import com.taller.ecommerce.model.OracleProduct;
import com.taller.ecommerce.model.Product;
import com.taller.ecommerce.repository.OracleDAO;
import com.taller.ecommerce.repository.ProductRepository;
import org.springframework.stereotype.Component;

@Component("oracle")
public class OracleFactory implements ProductFactory {
    @Override
    public Product createProduct(String id, String description, float price) {
        return new OracleProduct(id, description, price);
    }

    @Override
    public ProductRepository createDAO() {
        return new OracleDAO();
    }
}
