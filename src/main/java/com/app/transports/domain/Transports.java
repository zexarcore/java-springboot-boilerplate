package com.app.transports.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "transports")
@Data
public class Transports {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private int destination_id;

    @Column(nullable = true)
    private String type;

    @Column(nullable = true)
    private double price;

    @Column(nullable = true)
    private String duration;

    // Empty constructor (required for JPA)
    public Transports() {
    }

    // Constructor with parameters
    public Transports(Long id, int destination_id, String type, double price, String duration) {
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

    public void setDuration(String duration) {
        this.duration = duration;
    }
}