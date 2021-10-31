package com.company.Devices;

import com.company.Human;

public class Phone extends Device implements Saleable {
    final String producer;
    final String model;
    final Integer screenSize;
    public String os;
    final String yearOfProduktion;
    private Object Human;


    public Phone(String producer, String model, String producer1) {
        super(producer, model, yearOfProduktion);
        this.producer = producer1;
        this.model = model1;
        this.screenSize = screenSize;
        this.yearOfProduktion = yearOfProduktion;
    }

    public void turnOn(){
        System.out.println("wciskam przytisk");
    }

    public String toString(){
        return "Producer: "+ producer+"Model: "+model+"Przekatna ekranu: "+screenSize+"Cali"+"System Operacyjny: "+os;
    }

    @Override
    public void sale() {

    }

    @Override
    public void sale(Human saller, Human buyer, Double price) {
        if void sale (Human saller, Human buyer, Double price)
        if (saller.mobile == this){
            System.out.println("Sprzedawca nie ma telefonu");
        } elce if (buyer.cash < price){
            System.out.println("Sorry nie masz kasy");
        } elce {
            saller.cash += price;
            buyer.cash -= price;
            saller.mobile = null;
            buyer.mobile = this;
            System.out.println("Telefon" + this. producer + "sostal sprzedany za" + price);
        }
    }

    @Override
    public Double getPrice() {
        return null;
    }
}
