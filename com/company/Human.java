package com.company;
import com.company.devices.Car;
import com.company.devices.Phone;

public class Human extends Animal {
    String firstName;
    String LastName;
    Phone mobile;
    Animal pet;
    private Double salary;

    Human( ){
        super( "homo sapiens");
        this.salary = 0.0;
    }

    public void setSalary(Double salary){
        if (salary > 2000.00){
            this.salary = salary;
        }

    }

}


