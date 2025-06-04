package com.app.accommodations.infrastructure;


public class AccommodationDto {
    private Long id;
    private String name;
    private int destination_id;
    private String type;
    private String address;
    private double price_per_night;
    // Empty constructor
    public AccommodationDto() {
    }

    // Constructor with parameters
    public AccommodationDto(Long id, String name, int destination_id, String type, String address, double price_per_night) {
        this.id = id;
        this.name = name;
        this.destination_id = destination_id;
        this.type = type;
        this.address = address;
        this.price_per_night = price_per_night;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getPrice_per_night() {
        return price_per_night;
    }

    public void setPrice_per_night(double price_per_night) {
        this.price_per_night = price_per_night;
    }
    // toString() method
    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", destination_id='" + destination_id + '\'' +
                ", type='" + type + '\'' +
                ", address='" + address + '\'' +
                ", price_per_night='" + price_per_night + '\'' +
                '}';
    }
}
