package com.app.reservation.infrastructure;

public class ReservationDto {
    private Long id;
    private long users_Id;
    private long destination_Id;
    private long activity_id;
    private String reservations_date;
    private String quantity;

    // Constructor vacío
    public ReservationDto() {
    }

    // Constructor con parámetros
    public ReservationDto(Long id, long users_Id, long destination_Id, long activity_id, String reservations_date, String quantity) {
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

    // Método toString()
    @Override
    public String toString() {
        return "ReservationDto{" +
                "id=" + id +
                ", users_Id=" + users_Id +
                ", destination_Id=" + destination_Id +
                ", activity_id=" + activity_id +
                ", reservations_date='" + reservations_date + '\'' +
                ", quantity='" + quantity + '\'' +
                '}';
    }
}
