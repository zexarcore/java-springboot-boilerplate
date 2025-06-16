package com.app.activities.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "activities")
@Data
public class Activitie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private int destination_id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private double price;

    // Constructor vacío (requerido por JPA)
    public Activitie() {
    }

    // Constructor con parámetros
    public Activitie(Long id, int destination_id, String name, double price) {
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
}