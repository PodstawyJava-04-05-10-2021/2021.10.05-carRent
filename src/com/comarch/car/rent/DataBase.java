package com.comarch.car.rent;

public class DataBase {
    Car[] cars = new Car[5];

    public DataBase() {
        this.cars[0] = new Car("BMW", "3", 2010, "KR1");
        this.cars[1] = new Car("Mercedes", "E", 2015, "KR2");
        this.cars[2] = new Car("Toyota", "Corolla", 2012, "KR3");
        this.cars[3] = new Car("Mazda", "3", 2012, "KR4");
        this.cars[4] = new Car("Kia", "Ceed", 2012, "KR5");
    }

    boolean rentCar(String plate) {
        for(Car car : cars) {
            if(car.plate.equals(plate) && !car.rent) {
                car.rent = true;
                return true;
            }
        }
        return false;
    }
}
