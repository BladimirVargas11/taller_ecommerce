package com.taller.ecommerce.model;

import java.util.List;

public class OracleProduct extends Product {
    private String id;
    private String description;
    private float price;

    public OracleProduct(String id, String description, float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

}