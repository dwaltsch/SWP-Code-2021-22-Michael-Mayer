package com.smortify.michael.projekte.oop.car.auto;

import com.smortify.michael.projekte.oop.car.auto.bauteile.motor.Motor;
import com.smortify.michael.projekte.oop.car.auto.bauteile.reifen.Tire;
import com.smortify.michael.projekte.oop.car.auto.bauteile.spiegel.Rearmirror;
import com.smortify.michael.projekte.oop.car.auto.bauteile.tank.Tank;

public class Car {
    Tank t1 = new Tank();
    Motor m4 = new Motor();
    Tire r1 = new Tire();
    Rearmirror ruk1 = new Rearmirror();
    private String color;
    private String serial;

    public Car(Tank t1, Motor m4, Tire r1, Rearmirror ruk1, String color, String serial) {
        this.t1 = t1;
        this.m4 = m4;
        this.r1 = r1;
        this.ruk1 = ruk1;
        this.color = color;
        this.serial = serial;
    }

    public void drive(int speed) {
        m4.drive(speed);

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

