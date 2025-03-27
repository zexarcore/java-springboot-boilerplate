package com.app.roles.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "roles")
@Data
public class Roles {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true, unique = true)
    private String name;

    @Column(nullable = true)  
    private String type_operator;

    // Empty constructor (required for JPA)
    public Roles() {}

    // Constructor with parameters
    public Roles(Long id, String name, String type_operator) {
        this.id = id;
        this.name = name;
        this.type_operator = type_operator;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getTypeOperator() {
        return type_operator;
    }

    // Setters
    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setTypeOperator(String type_operator) {
        this.type_operator = type_operator;
    }
}