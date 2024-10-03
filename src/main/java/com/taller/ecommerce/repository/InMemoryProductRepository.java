package com.taller.ecommerce.repository;

import com.taller.ecommerce.model.Product;

import java.util.ArrayList;
import java.util.List;

public class InMemoryProductRepository extends Product {

    private final List<Product> productList = new ArrayList<>();



}

