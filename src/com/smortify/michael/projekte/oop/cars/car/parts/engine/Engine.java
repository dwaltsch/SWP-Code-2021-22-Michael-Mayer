package com.smortify.michael.projekte.oop.cars.car.parts.engine;

public class Engine {
    private fuelType type;
    private int horsepower;

    public Engine(fuelType type, int horsepower) {
        this.type = type;
        this.horsepower = horsepower;
    }

    public fuelType getType() {
        return type;
    }

    public void setType(fuelType type) {
        this.type = type;
    }

    public int getHorsepower() {
        return horsepower;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    public enum fuelType {Diesel, Benzin}
}
