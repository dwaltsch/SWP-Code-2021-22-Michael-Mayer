package com.smortify.michael.projekte.oop.testpractice;

public class Handy {
    String brand;
    String color;
    Camera camera;

    public Handy(String brand, String color, Camera camera) {
        this.brand = brand;
        this.color = color;
        this.camera = camera;
    }

    public void turnOn() {
        System.out.println("I bin an");
    }

    public String getBrand() {
        return brand;
    }


    public String getColor() {
        return color;
    }


    public Camera getCamera() {
        return camera;
    }

    public void setCamera(Camera camera) {
        this.camera = camera;
    }
}
