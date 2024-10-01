package com.taller.ecommerce.controller;

import com.taller.ecommerce.model.ConcreteProduct;
import com.taller.ecommerce.model.Product;
import com.taller.ecommerce.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/products")
public class ProductController {

    private final ProductService productService;

    @Autowired
    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    @PostMapping
    public ConcreteProduct createProduct(@RequestBody ConcreteProduct product) {
        // Lógica para guardar el producto, por ejemplo:
        // productService.save(product);
        return product; // Retornar el producto creado
    }
    @GetMapping("/{id}")
    public Product getProduct(@PathVariable String id) {
        return productService.getProduct(id);
    }

    @PutMapping
    public void updateProduct(@RequestBody Product product) {
        productService.updateProduct(product);
    }

    @DeleteMapping("/{id}")
    public void removeProduct(@PathVariable String id) {
        productService.removeProduct(id);
    }
}

