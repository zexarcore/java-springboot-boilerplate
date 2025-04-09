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
    private Long userId;

    @ManyToOne
    @JoinColumn(name = "vehicle_id", nullable = false) 
    @NotNull
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false, unique = true) 
    @NotNull
    private Service service;

    @ManyToOne
    @JoinColumn(name = "service_state_id", nullable = false)
    @NotNull
    private ServiceState serviceState;

    @ManyToOne
    @JoinColumn(name = "operator_id", nullable = false) 
    @NotNull
    private Operator operator;
}