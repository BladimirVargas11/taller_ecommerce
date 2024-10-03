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

import java.util.Map;

@Configuration
public class DatabaseConfig {
    @Value("${db.type}")
    private String dbType;

    private final Map<String, ProductFactory> productFactoryMap;


    public DatabaseConfig(Map<String, ProductFactory> productFactoryMap) {
        this.productFactoryMap = productFactoryMap;
    }

    @Bean
    public ProductFactory productFactory() {
        ProductFactory factory = productFactoryMap.get(dbType.toLowerCase());
        if (factory == null) {
            throw new IllegalArgumentException("Database type not supported: " + dbType);
        }
        return factory;
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
