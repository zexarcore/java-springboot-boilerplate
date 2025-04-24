package com.app.users.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long Roleid;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false, unique = true)
    private String email;

    @Column(nullable = false, unique = true)
    private String phone;

    @Column(nullable = false)
    private String password;

    // Empty constructor (required for JPA)
    public User() {}

    // Constructor with parameters
    public User(Long Roleid, String name, String email, String password, String phone) {
        this.Roleid = Roleid;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.password = password;
    }

    // Getters y Setters
    public Long getId() {
        return Roleid;
    }

    public void setRoleid(Long id) {
        this.Roleid = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }


    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}