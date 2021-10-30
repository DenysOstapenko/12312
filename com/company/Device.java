package com.company;

public class Device {

    final String yearOfProduktion;
    final String producer;
    final String model;
    final double weight;

    public Device(String yearOfProduktion, String producer, String model, double weight) {
        this.yearOfProduktion = yearOfProduktion;
        this.producer = producer;
        this.model = model;
        this.weight = weight;
    }
}
