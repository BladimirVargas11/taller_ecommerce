package com.taller.ecommerce.service;

import com.taller.ecommerce.repository.ProductRepository;
import com.taller.ecommerce.model.Product;

public class ProductServiceImpl implements ProductService {
    private ProductRepository productRepository;

    public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @Override
    public void addProduct(Product product) {
        productRepository.createProduct(product);
    }

    @Override
    public Product getProduct(String id) {
        return productRepository.readProduct(id);
    }

    @Override
    public void updateProduct(Product product) {
        productRepository.updateProduct(product);
    }

    @Override
    public void removeProduct(String id) {
        productRepository.deleteProduct(id);
    }
}
