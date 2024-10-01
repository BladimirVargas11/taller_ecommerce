package com.taller.ecommerce.model;

public class ConcreteProduct implements Product {
    private String id;
    private String description;
    private float price;

    // Constructor vacío
    public ConcreteProduct() {}

    // Constructor con parámetros (opcional)
    public ConcreteProduct(String id, String description, float price) {
        this.id = id;
        this.description = description;
        this.price = price;
    }

    // Implementación de los métodos de la interfaz
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

    // Getters y setters (opcional)
    public void setId(String id) {
        this.id = id;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setPrice(float price) {
        this.price = price;
    }
}
