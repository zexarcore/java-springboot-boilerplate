package com.app.brands.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "brands")
@Data
public class Brand {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    // Empty constructor (required for JPA)
    public Brand() {}

    // Constructor with parameters
<<<<<<< HEAD:src/main/java/com/app/typevehicles/domain/TypeVehicle.java
    public TypeVehicle(Long id, String name) {
=======
    public Brand(Long id, String name) {
>>>>>>> master:src/main/java/com/app/brands/domain/Brand.java
        this.id = id;
        this.name = name;
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

}