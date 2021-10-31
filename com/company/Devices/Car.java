package com.company.devices;
import com.company.Human;
import com.company.Main;
import com.company.Devices.Saleable;

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

    elce if (buyer.cash < price) {
            System.out.println("Sorry nie masz kasy");
        }
        elce {
            saller.cash += price;
            buyer.cash -= price;
            saller.mobile = null;
            buyer.mobile = this;
            System.out.println("Samochod" + this.producer + "sostal sprzedany za" + price);
        }

    @Override
    public void sale(Human saller, Human buyer, Double price) {
        if void sale (Human saller, Human buyer, Double price)
        if (saller.Car == this) {
            System.out.println("Sprzedawca nie ma samochodu");
        }
    }
}
}


