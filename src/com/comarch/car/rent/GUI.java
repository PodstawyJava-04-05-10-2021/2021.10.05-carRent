package com.comarch.car.rent;

public class GUI {

    static void showMenu() {
        System.out.println("1. Lista aut");
        System.out.println("2. Wypożycz auto");
        System.out.println("3. Wyjdź");
    }

    static void printCarList(Car[] cars) {
        for (Car car : cars) {
            System.out.print(car.brand + " " + car.model + " rok: " + car.year + " rejestracja: " + car.plate);
            if (car.rent) {
                System.out.print(" niedostępny");
            } else {
                System.out.print(" dostępny");
            }
            System.out.println();
        }
    }
}
