package com.example.sven.locationmicro.domain;

import javax.persistence.*;

public class Car {

    private Long id;
    private String name;
    private double price;
    private String licensePlate;

    public Car() {
    }

    public Car(String name, double price, String licensePlate) {
        this.name = name;
        this.price = price;
        this.licensePlate = licensePlate;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", licensePlate='" + licensePlate + '\'' +
                '}';
    }
}
