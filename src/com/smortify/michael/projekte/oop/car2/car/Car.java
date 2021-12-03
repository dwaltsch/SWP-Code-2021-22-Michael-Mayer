package com.smortify.michael.projekte.oop.car2.car;

import com.smortify.michael.projekte.oop.car2.car.manufacturer.Manufacturer;
import com.smortify.michael.projekte.oop.car2.car.parts.engine.Engine;

public class Car {
    private int maxspeed;
    private int price;
    private int fuelusage;
    private Engine engine;
    private Manufacturer manufacturer;

    public Car(int maxspeed, int price, int fuelusage, Engine engine, Manufacturer manufacturer) {
        this.maxspeed = maxspeed;
        this.price = price;
        this.fuelusage = fuelusage;
        this.engine = engine;
        this.manufacturer = manufacturer;
    }

    public int getMaxspeed() {
        return maxspeed;
    }

    public void setMaxspeed(int maxspeed) {
        this.maxspeed = maxspeed;
    }

    public int getPrice() {
        int realprice;
        realprice = price - ((price / 100) * manufacturer.getManufacturerdiscount());
        return realprice;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getFuelusage() {
        return fuelusage;
    }

    public void setFuelusage(int fuelusage) {
        this.fuelusage = fuelusage;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }
}
