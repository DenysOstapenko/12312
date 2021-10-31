package com.company.Devices;

import com.company.Human;

public interface Saleable {
    void sale(Human saller, Human buyer, Double price);
    Double getPrice();
}
