package com.app.reservation.domain;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "transports")
@Data
public class Reservation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = true)
    private int users_Id;

    @Column(nullable = true)
    private String itinerary_id;

    @Column(nullable = true)
    private String activity_id;

    @Column(nullable = true)
    private double accommodations_id;

    @Column(nullable = false)
    private String reservations_date;

    @Column(nullable = true)
    private String quantity;

    // Empty constructor (required for JPA)
    public Reservation() {
    }

    // Constructor with parameters
    public Reservation(Long id, int users_Id, String itinerary_id, String activity_id, double accommodations_id, String reservations_date, String quantity) {
        this.id = id;
        this.users_Id = users_Id;
        this.itinerary_id = itinerary_id;
        this.activity_id = activity_id;
        this.accommodations_id = accommodations_id;
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

    public int getUsers_Id() {
        return users_Id;
    }

    public void setUsers_Id(int users_Id) {
        this.users_Id = users_Id;
    }

    public String getItinerary_id() {
        return itinerary_id;
    }

    public void setItinerary_id(String itinerary_id) {
        this.itinerary_id = itinerary_id;
    }

    public String getActivity_id() {
        return activity_id;
    }

    public void setActivity_id(String activity_id) {
        this.activity_id = activity_id;
    }

    public double getAccommodations_id() {
        return accommodations_id;
    }

    public void setAccommodations_id(double accommodations_id) {
        this.accommodations_id = accommodations_id;
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