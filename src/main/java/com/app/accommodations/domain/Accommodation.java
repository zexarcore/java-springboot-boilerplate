package com.app.accommodations.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "accommodations")
@Data
public class Accommodation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private int destination_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String type;

    @Column(nullable = true)
    private String address;

    @Column(nullable = true)
    private double price_per_night;

    // Empty constructor (required for JPA)
    public Accommodation() {
    }

    // Constructor with parameters
    public Accommodation(Long id, int destination_id, String name, String address, double price_per_night) {
        this.id = id;
        this.destination_id = destination_id;
        this.name = name;
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
}