package com.app.reservation.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "reservations")
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private long users_Id;

    @Column(nullable = true)
    private long destination_Id;

    @Column(nullable = true)
    private long activity_id;

    @Column(nullable = false)
    private String reservations_date;

    @Column(nullable = true)
    private String quantity;

    // Constructor vacío (requerido por JPA)
    public Reservation() {
    }

    // Constructor con parámetros
    public Reservation(Long id, long users_Id, long destination_Id, long activity_id, String reservations_date, String quantity) {
        this.id = id;
        this.users_Id = users_Id;
        this.destination_Id = destination_Id;
        this.activity_id = activity_id;
        this.reservations_date = reservations_date;
        this.quantity = quantity;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public long getUsers_Id() {
        return users_Id;
    }

    public void setUsers_Id(long users_Id) {
        this.users_Id = users_Id;
    }

    public long getDestination_Id() {
        return destination_Id;
    }

    public void setDestination_Id(long destination_Id) {
        this.destination_Id = destination_Id;
    }

    public long getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(long activity_id) {
        this.activity_id = activity_id;
    }

    public String getReservations_date() {
        return reservations_date;
    }

    public void setReservations_date(String reservations_date) {
        this.reservations_date = reservations_date;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }
}