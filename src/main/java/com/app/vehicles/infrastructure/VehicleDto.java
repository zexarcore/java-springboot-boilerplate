package com.app.vehicles.infrastructure;

public class VehicleDto {
    private Long id;
    private String plate;
    private String typeVehicle;
    private String brand;
    private String color;

    // Empty constructor
    public VehicleDto() {
    }

    // Constructor with parameters
    public VehicleDto(Long id, String plate, String typeVehicle, String brand, String color) {
        this.id = id;
        this.plate = plate;
        this.typeVehicle = typeVehicle;
        this.brand = brand;
        this.color = color;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getPlate() {
        return plate;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public String getTypeVehicle() {
        return typeVehicle;
    }

    public void setTypeVehicle(String typeVehicle) {
        this.typeVehicle = typeVehicle;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // toString() method
    @Override
    public String toString() {
        return "VehicleDto{" +
                "id=" + id +
                ", plate='" + plate + '\'' +
                ", typeVehicle='" + typeVehicle + '\'' +
                ", brand='" + brand + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
