package com.smortify.michael.projekte.oop.car.auto;

import com.smortify.michael.projekte.oop.car.auto.bauteile.motor.Motor;
import com.smortify.michael.projekte.oop.car.auto.bauteile.reifen.Tire;
import com.smortify.michael.projekte.oop.car.auto.bauteile.spiegel.Rearmirror;
import com.smortify.michael.projekte.oop.car.auto.bauteile.tank.Tank;

public class Auto {
    Tank t1 = new Tank();
    Motor m4 = new Motor();
    Tire r1 = new Tire();
    Rearmirror ruk1 = new Rearmirror();
    private String color;
    private String serial;

    public void drive() {


    }

    ;

    public void brk() {

    }

    ;

    public void grange(int verbrauch) {
        t1.restreichweite(verbrauch);
    }

    ;

    public void honk(int amnt) {
        for (int i = 0; i < amnt; i++) {
            System.out.println("Fahr mol a klele");
        }
    }

}

