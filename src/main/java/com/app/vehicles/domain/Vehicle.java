package com.app.vehicles.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "vehicles")
@Data
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String plate;

    @Column(nullable = false)
    private int type_vehicle_id;

    @Column(nullable = false)
    private int brand_id;

    @Column(nullable = false, unique = true)
    private String color;

    // Empty constructor (required for JPA)
    public Vehicle() {}

    // Constructor with parameters
    public Vehicle(Long id, String plate, int type_vehicle_id, int brand_id, String color) {
        this.id = id;
        this.plate = plate;
        this.type_vehicle_id = type_vehicle_id; 
        this.brand_id = brand_id;
        this.color = color;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public String getPlate() {
        return plate;
    }

    public int getType_vehicle_id() {
        return type_vehicle_id;
    }

    public int getBrand_id() {
        return brand_id;
    }

    public String getColor() {
        return color;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setPlate(String plate) {
        this.plate = plate;
    }

    public void setType_vehicle_id(int type_vehicle_id) {
        this.type_vehicle_id = type_vehicle_id;
    }

    public void setBrand_id(int brand_id) {
        this.brand_id = brand_id;
    }

    public void setColor(String color) {
        this.color = color;
    }
}