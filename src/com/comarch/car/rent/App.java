package com.comarch.car.rent;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        DataBase dataBase = new DataBase();

        while(true) {
            GUI.showMenu();
            switch (reader.readLine()) {
                case "1":
                    GUI.printCarList(dataBase.cars);
                    break;
                case "2":
                    System.out.println("Podaj rejestrację:");
                    if(dataBase.rentCar(reader.readLine())) {
                        System.out.println("Wypożyczono auto !!");
                    } else {
                        System.out.println("Nie ma takiego auta lub jest wypożyczone !!");
                    }
                    break;
                case "3":
                    System.exit(0);
                    break;
                default:
                    System.out.println("Nieprawidłowy wybór !!");
                    break;
            }
        }
    }
}
