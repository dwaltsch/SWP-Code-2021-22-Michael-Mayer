package com.smortify.michael.projekte.oop.testpractice;

public class Main {
    public static void main(String[] args) {
        Camera camera = new Camera(10);
        Handy handy = new Handy("Huragweih", "red0", camera);
        handy.turnOn();
        handy.getCamera().takePicture();
    }
}
