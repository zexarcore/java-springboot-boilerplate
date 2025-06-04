package com.app.activities.infrastructure;

public class ActivitiesDto {
    private Long id;
    private int destination_id;
    private String name;
    private String description;
    private String schedule;
    private double price;

    // Empty constructor
    public ActivitiesDto() {
    }

    // Constructor with parameters
    public ActivitiesDto(Long id, int destination_id, String name, String description, String schedule, double price) {
        this.id = id;
        this.destination_id = destination_id;
        this.name = name;
        this.description = description;
        this.schedule = schedule;
        this.price = price;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getDestination_id() {
        return destination_id;
    }

    public void setDestination_id(int destination_id) {
        this.destination_id = destination_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    // toString() method
    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", destination_id='" + destination_id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", schedule='" + schedule + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
