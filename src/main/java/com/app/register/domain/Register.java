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
    @JoinColumn(name = "vehicle_id", nullable = false)
    @NotNull(message = "Vehicle cannot be null")
    private Vehicle vehicle;

    @ManyToOne
    @JoinColumn(name = "service_id", nullable = false)
    @NotNull(message = "Service cannot be null")
    private Service service;

    @ManyToOne
    @JoinColumn(name = "service_state_id", nullable = false)
    @NotNull(message = "ServiceState cannot be null")
    private ServiceState serviceState;

    @ManyToOne
    @JoinColumn(name = "operator_id", nullable = false)
    @NotNull(message = "Operator cannot be null")
    private Operator operator;
}