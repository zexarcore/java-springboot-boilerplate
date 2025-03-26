package com.app.typevehicles.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "typevehicles")
@Data
public class TypeVehicles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String name;

    // Empty constructor (required for JPA)
    public TypeVehicles() {
    }

    // Constructor with parameters
    public TypeVehicles(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getters y Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}