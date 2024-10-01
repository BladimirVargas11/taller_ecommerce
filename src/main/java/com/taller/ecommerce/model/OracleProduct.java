package com.taller.ecommerce.model;

public class OracleProduct implements Product {
    private String id;
    private String description;
    private float price;

    public OracleProduct(String id, String description, float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    @Override
    public String getId() {
        return id;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public float getPrice() {
        return price;
    }
}