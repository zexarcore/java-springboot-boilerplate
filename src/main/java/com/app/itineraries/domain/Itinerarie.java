package com.app.itineraries.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "itineraries")
@Data
public class Itinerarie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private int users_Id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String creationDate;

    // Empty constructor (required for JPA)
    public Itinerarie() {
    }

    // Constructor with parameters
    public Itinerarie(Long id, int users_Id, String name, String creation_date) {
        this.id = id;
        this.users_Id = users_Id;
        this.name = name;
        this.creationDate = creation_date;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getUsers_Id() {
        return users_Id;
    }

    public void setUsers_Id(int users_Id) {
        this.users_Id = users_Id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCreation_date() {
        return this.creationDate;
    }

    public void setCreation_date(String creation_date) {
        this.creationDate = creation_date;
    }
}