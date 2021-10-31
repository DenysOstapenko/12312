package com.company;

import com.company.Devices.Saleable;

public class Animal implements Saleable {
    private static final Double DEFAULT_ANIMAL_WEIGHT = 1.0;
    private static final Double DEFAULT_DOG_WEIGHT = 12.0;
    private static final Double DEFAULT_CAT_WEIGHT = 2.3;
    String species = null;
    String name;
    Double weight;
    Integer age;
    Boolean alive;

    Animal(){
        this.alive = true;
        this.age = 1;
        this.species = species;
    }




    Animal(String species) {
        this.species = species; //wartosc z parametru
        this.alive = true; //wartosc domyslna
        if (this.species == "canis") {
            this.weight = DEFAULT_DOG_WEIGHT;
        } else if (this.species == "felis") {
            this.weight = DEFAULT_CAT_WEIGHT;
        } else {
            this.weight = DEFAULT_ANIMAL_WEIGHT;
        }
    }

    void feed() {
        if(weight>0) {
            weight++;
            System.out.println("Moja waga to: " + weight);
        }else{
            System.out.println("Zwierze nie żyje");
        }
    }
    void takeForAWalk() {
        weight--;
        if(weight==0){
            System.out.println("Już za późno ");
            alive=false;
        }else if(alive==false){
            System.out.println("Przykro mi ");
        }
        else{
            System.out.println("Moja waga to: " + weight);
        }
    }
    void feed(Double foodWeight) {
        weight += foodWeight;
        System.out.println("Ilosc jedzenia: " + weight);
    }
    Double getWeight() {
        return weight;
    }
    public String toString()
    {
        return "Imię: " + name + " Waga: " + weight  +" Lata: " + age + " Czy zyje : "+ alive;
    }

    public void sale(Human me, Human brotherInLaw) {

    }

    @Override
    public Double getPrice() {
        return null;
    }

    @Override
    public void sale(Human saller, Human buyer, Double price) {
        if void sale (Human saller, Human buyer, Double price)
        if (saller == this){
            System.out.println("Sprzedawca nie ma telefonu");
        }
        Object elce;
        elce if (buyer.cash < price){
            System.out.println("Sorry nie masz kasy");
        } elce if (this instanceof  Human){
            System.out.println("CALL TO POLICE");
        } elce {
            aller.cash += price;
            buyer.cash -= price;
            saller.mobile = null;
            buyer.mobile = this;
            System.out.println("Zwierz" + this. producer + "sostal sprzedany za" + price);
        }


