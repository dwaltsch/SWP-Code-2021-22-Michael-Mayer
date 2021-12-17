package com.smortify.michael.projekte.oop.O11toO14cars.car;

import com.smortify.michael.projekte.oop.O11toO14cars.car.manufacturer.Manufacturer;
import com.smortify.michael.projekte.oop.O11toO14cars.car.parts.engine.Engine;

public class Car {
    private int maxspeed;
    private int price;
    private int fuelusage;
    private Engine engine;
    private Manufacturer manufacturer;
    private int mileage;

    public Car(int mileage, int maxspeed, int price, int fuelusage, Engine engine, Manufacturer manufacturer) {
        this.mileage = mileage;
        this.maxspeed = maxspeed;
        this.price = price;
        this.fuelusage = fuelusage;
        this.engine = engine;
        this.manufacturer = manufacturer;
    }

    public void stop() {
        System.out.println("OK");
    }

    ;

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public void printMileage() {
        System.out.println(this.mileage);
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

    public void drive(int amountofkm) {
        this.mileage = getMileage() + amountofkm;
        if (this.mileage >= 50000) {
            this.fuelusage = (int) (this.fuelusage * 1.098);
            System.out.println("Current Fuel usage " + getFuelusage() + " l per 100 km");
        } else {
            System.out.println("Current Fuel usage " + getFuelusage() + " l per 100 km");
        }
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
