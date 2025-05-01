package com.app.register.domain;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;

@Entity
@Table(name = "registers")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Register {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id; // Cambiado de userId a id para mayor claridad
    @ManyToOne
    @Column(name = "user_id", nullable = false)
    @NotNull(message = "user cannot be null")
    private int User_id;

    @ManyToOne
    @Column(name = "vehicle_id", nullable = false)
    @NotNull(message = "Vehicle cannot be null")
    private int vehicle;

    @ManyToOne
    @Column(name = "service_id", nullable = false)
    @NotNull(message = "Service cannot be null")
    private int service;

    @ManyToOne
    @Column(name = "service_state_id", nullable = false)
    @NotNull(message = "ServiceState cannot be null")
    private int serviceState;

    @ManyToOne
    @Column(name = "operator_id", nullable = false)
    @NotNull(message = "Operator cannot be null")
    private int operator;

    @ManyToOne
    @Column(name = "RegisterData", nullable = false)
    @NotNull(message = "Data cannot be null")
    private Data RegisterDate;

}