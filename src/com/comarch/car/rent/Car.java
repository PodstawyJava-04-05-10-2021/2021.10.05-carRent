package com.comarch.car.rent;

public class Car {
    String brand;
    String model;
    int year;
    String plate;
    boolean rent;

    public Car(String brand, String model, int year, String plate) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.plate = plate;
        this.rent = false;
    }
}
