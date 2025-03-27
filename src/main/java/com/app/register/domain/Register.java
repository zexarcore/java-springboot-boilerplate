package com.app.register.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "users")
@Data
public class Register {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long User_id;

    @Column(nullable = false)
    private int vehicule_id;

    @Column(nullable = false, unique = true)
    private int service_id;

    @Column(nullable = false)
    private int service_state_id;

    @Column(nullable = false)
    private int operador_id;

    // Empty constructor (required for JPA)
    public Register() {}

    // Constructor with parameters
    public Register(Long User_id, int vehicule_id, int service_id, int service_state_id, int operador_id) {
        this.User_id = User_id;
        this.vehicule_id = vehicule_id;
        this.service_id = service_id;
        this.service_state_id = service_state_id;
        this.operador_id = operador_id;
    }

    // Getters y Setters
    public Long getId() {
        return User_id;
    }

    public void setId(Long id) {
        this.User_id = id;
    }

    public int getVehicule_id() {
        return vehicule_id;
    }

    public void setVehicule_id(int vehicule_id) {
        this.vehicule_id = vehicule_id;
    }

    public int getService_id() {
        return service_id;
    }

    public void setService_id(int service_id) {
        this.service_id = service_id;
    }

    public int getService_state_id() {
        return this.service_state_id;
    }

    public void setService_state_id(int service_state_id) {
        this.service_state_id = service_state_id;

    }
    public int getOperador_idd() {
        return this.operador_id;
    }

    public void setOperador_idd(int operador_id) {
        this.operador_id = operador_id;
    }
}