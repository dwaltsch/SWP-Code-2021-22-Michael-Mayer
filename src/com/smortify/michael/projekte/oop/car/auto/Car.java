package com.smortify.michael.projekte.oop.car.auto;

import com.smortify.michael.projekte.oop.car.auto.bauteile.motor.Motor;
import com.smortify.michael.projekte.oop.car.auto.bauteile.reifen.Tire;
import com.smortify.michael.projekte.oop.car.auto.bauteile.spiegel.Rearmirror;
import com.smortify.michael.projekte.oop.car.auto.bauteile.tank.Tank;

import java.util.ArrayList;
import java.util.List;

public class Car {

    private final Motor motor;
    private final Tank tank;
    private final String color;
    private final String serial;
    private final String brand;
    private final List<Rearmirror> mirror;
    private final List<Tire> tires;

    public Car(Motor motor, Tank tank, String color, String serial, String brand) {
        this.motor = motor;
        this.tank = tank;
        this.color = color;
        this.serial = serial;
        this.brand = brand;
        this.mirror = new ArrayList<>();
        this.tires = new ArrayList<>();
    }


    public void drive(Tank tank, int speed) {
        motor.drive(tank, speed);

    }


    public void breakcar() {
        System.out.println("Ich bremse");
    }

    public void getrange(int verbrauch) {
        tank.restreichweite(verbrauch);
    }

    public void honk(int amnt) {
        for (int i = 0; i < amnt; i++) {
            System.out.println("Honk honk");
        }
    }

    public void tanken(int fuelvariant, int amount) {
        if (fuelvariant == 1) {
            // Benzin
        } else if (fuelvariant == 2) {
            // Diesel
        } else if (fuelvariant == 3) {
            // AdBlau
        }
    }

    public void addmirror(Rearmirror rearmirror) {
        this.mirror.add(rearmirror);
    }

    public void addtires(Tire tires) {
        this.tires.add(tires);
    }

    public List<Rearmirror> getMirror() {
        return mirror;
    }

    public List<Tire> getTires() {
        return tires;
    }
}

