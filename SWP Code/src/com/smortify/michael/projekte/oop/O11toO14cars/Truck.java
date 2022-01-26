package com.smortify.michael.projekte.oop.O11toO14cars;

import com.smortify.michael.projekte.oop.O11toO14cars.car.Car;
import com.smortify.michael.projekte.oop.O11toO14cars.car.manufacturer.Manufacturer;
import com.smortify.michael.projekte.oop.O11toO14cars.car.parts.engine.Engine;

public class Truck extends Car {
    private String trailer;

    public Truck(String trailer, int mileage, int maxspeed, int price, int fuelusage, Engine engine, Manufacturer manufacturer) {
        super(mileage, maxspeed, price, fuelusage, engine, manufacturer);
        this.trailer = trailer;
    }

    public String getTrailer() {
        return trailer;
    }

    public void setTrailer(String trailer) {
        this.trailer = trailer;
    }
}
