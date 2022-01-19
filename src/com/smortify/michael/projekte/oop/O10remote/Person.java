package com.smortify.michael.projekte.oop.O10remote;

import com.smortify.michael.projekte.oop.O10remote.battery.Battery;

public class Person {
    public static void main(String[] args) {
        Battery battery1 = new Battery(100);
        Battery battery2 = new Battery(100);
        Remote remote = new Remote(battery1, battery2);
        remote.turnOn();
        remote.getStatus();
    }
}
