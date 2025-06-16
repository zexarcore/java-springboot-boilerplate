package com.app.destinations.infrastructure;

public class DestinationDto {
    private Long id;
    private String nameDestination;
    private int baseNights;
    private String nameHotel;
    private double pricePerNight;
    private String typeTransport;
    private double priceTrasport;
    private double mealsPrice;

    // Constructor vacío
    public DestinationDto() {
    }

    // Constructor con parámetros
    public DestinationDto(Long id, String nameDestination, int baseNights, String nameHotel,
            double pricePerNight, String typeTransport, double priceTrasport, double mealsPrice) {
        this.id = id;
        this.nameDestination = nameDestination;
        this.baseNights = baseNights;
        this.nameHotel = nameHotel;
        this.pricePerNight = pricePerNight;
        this.typeTransport = typeTransport;
        this.priceTrasport = priceTrasport;
        this.mealsPrice = mealsPrice;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameDestination() {
        return nameDestination;
    }

    public void setNameDestination(String nameDestination) {
        this.nameDestination = nameDestination;
    }

    public int getBaseNights() {
        return baseNights;
    }

    public void setBaseNights(int baseNights) {
        this.baseNights = baseNights;
    }

    public String getNameHotel() {
        return nameHotel;
    }

    public void setNameHotel(String nameHotel) {
        this.nameHotel = nameHotel;
    }

    public double getPricePerNight() {
        return pricePerNight;
    }

    public void setPricePerNight(double pricePerNight) {
        this.pricePerNight = pricePerNight;
    }

    public String getTypeTransport() {
        return typeTransport;
    }

    public void setTypeTransport(String typeTransport) {
        this.typeTransport = typeTransport;
    }

    public double getPriceTrasport() {
        return priceTrasport;
    }

    public void setPriceTrasport(double priceTrasport) {
        this.priceTrasport = priceTrasport;
    }

    public double getMealsPrice() {
        return mealsPrice;
    }

    public void setMealsPrice(double mealsPrice) {
        this.mealsPrice = mealsPrice;
    }

    @Override
    public String toString() {
        return "DestinationDto{" +
                "id=" + id +
                ", nameDestination='" + nameDestination + '\'' +
                ", baseNights=" + baseNights +
                ", nameHotel='" + nameHotel + '\'' +
                ", pricePerNight=" + pricePerNight +
                ", typeTransport='" + typeTransport + '\'' +
                ", priceTrasport=" + priceTrasport +
                ", mealsPrice=" + mealsPrice +
                '}';
    }
}
