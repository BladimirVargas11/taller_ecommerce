package com.taller.ecommerce.config;

import com.taller.ecommerce.factory.MySQLFactory;
import com.taller.ecommerce.factory.OracleFactory;
import com.taller.ecommerce.factory.ProductFactory;
import com.taller.ecommerce.repository.ProductRepository;
import com.taller.ecommerce.service.ProductService;
import com.taller.ecommerce.service.ProductServiceImpl;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DatabaseConfig {

    @Value("${db.type}")
    private String dbType;

    @Bean
    public ProductFactory productFactory() {
        try {
            switch (dbType.toLowerCase()) {
                case "mysql":
                    return new MySQLFactory();
                case "oracle":
                    return new OracleFactory();
                default:
                    throw new IllegalArgumentException("Database type not supported: " + dbType);
            }
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("Failed to create ProductFactory: " + e.getMessage());
        }
    }

    @Bean
    public ProductRepository productRepository(ProductFactory productFactory) {
        return productFactory.createDAO();
    }

    @Bean
    public ProductService productService(ProductRepository productRepository) {
        return new ProductServiceImpl(productRepository);
    }
}
