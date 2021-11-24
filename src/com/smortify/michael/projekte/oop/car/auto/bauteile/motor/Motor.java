package com.smortify.michael.projekte.oop.car.auto.bauteile.motor;

public class Motor {
    private int fuelusage;

    public int getFuelusage() {
        return fuelusage;
    }

    public void setFuelusage(int fuelusage) {
        this.fuelusage = fuelusage;
    }

    public void drive(int speed) {
        System.out.println("I am driving very fast brrrrrrrrrr");
    }
}