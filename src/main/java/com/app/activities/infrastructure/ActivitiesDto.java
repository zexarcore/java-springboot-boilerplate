package com.app.activities.infrastructure;

public class ActivitiesDto {
    private Long id;
    private int destination_id;
    private String name;
    private double price;

    // Constructor vacío
    public ActivitiesDto() {
    }

    // Constructor con parámetros
    public ActivitiesDto(Long id, int destination_id, String name, double price) {
        this.id = id;
        this.destination_id = destination_id;
        this.name = name;
        this.price = price;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDestination_id() {
        return destination_id;
    }

    public void setDestination_id(int destination_id) {
        this.destination_id = destination_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // Método toString()
    @Override
    public String toString() {
        return "ActivitiesDto{" +
                "id=" + id +
                ", destination_id=" + destination_id +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
