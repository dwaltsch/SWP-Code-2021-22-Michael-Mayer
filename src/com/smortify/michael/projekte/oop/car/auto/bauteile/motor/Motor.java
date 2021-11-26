package com.smortify.michael.projekte.oop.car.auto.bauteile.motor;

public class Motor {
    private int fuelusage;
    private TYPE type;
    public enum TYPE {DIESEL, BENZIN};
    public int getFuelusage() {
        return fuelusage;
    }

    public Motor(int fuelusage, TYPE type) {
        this.fuelusage = fuelusage;
        this.type = type;
    }

    public void setFuelusage(int fuelusage) {
        this.fuelusage = fuelusage;
    }
    public void drive(int speed) {
        System.out.println("I am driving very fast brrrrrrrrrr");
    }

}