package com.app.itineraries.infrastructure;

public class ItinerarieDto {
    private Long id;
    private int users_Id;
    private String name;
    private String creation_date;

    // Empty constructor
    public ItinerarieDto() {
    }

    // Constructor with parameters
    public ItinerarieDto(Long id, int users_Id, String name, String creation_date) {
        this.id = id;
        this.users_Id = users_Id;
        this.name = name;
        this.creation_date = creation_date;
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
        return this.creation_date;
    }

    // toString() method
    @Override
    public String toString() {
        return "UserDto{" +
                "id=" + id +
                ", users_Id='" + users_Id + '\'' +
                ", name='" + name + '\'' +
                ", creation_date='" + creation_date + '\'' +
                '}';
    }
}
