package com.company.devices;
import com.company.Devices.Car;
import com.company.Devices.Phone;
public class Car {
    public String model;
    public String producer;
    public Double value;
    public Integer year;
    public Double weight;
    public Integer doors;

    public Car(String producer, String model, Integer yearOfProduktion) {
        super(producer, model, yearOfProduktion);
    }

    void turnOn(){
        System.out.println("Wrr ");
    }

    public String showCar(){return "Marka: "+producer + " Model: "+model + " Rok produkcji: "+year+ " Waga: "+ weight+" Liczba drzwi: "+doors;}
}
