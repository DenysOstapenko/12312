package com.company.Devices;

public class Phone extends Device implements Saleable {
    final String producer;
    final String model;
    final Integer screenSize;
    public String os;

    public Phone(String producer, String model, Integer screenSize) {
        this.producer = producer;
        this.model = model;
        this.screenSize = screenSize;
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
    public Double getPrice() {
        return null;
    }
}
