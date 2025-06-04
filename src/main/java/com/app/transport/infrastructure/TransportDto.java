package com.app.transport.infrastructure;

public class TransportDto {
    private Long id;
    private int destination_id;
    private String type;
    private double price;
    private String duration;

    // Empty constructor
    public TransportDto() {
    }

    // Constructor with parameters
    public TransportDto(Long id, int destination_id, String type, double price, String duration) {
        this.id = id;
        this.destination_id = destination_id;
        this.type = type;
        this.price = price;
        this.duration = duration;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDuration() {
        return duration;
    }

    // toString() method
    @Override
    public String toString() {
        return "TransportDto{" +
                "id=" + id +
                ", destination_id='" + destination_id + '\'' +
                ", type='" + type + '\'' +
                ", price='" + price + '\'' +
                ", duration='" + duration + '\'' +
                '}';
    }
}
