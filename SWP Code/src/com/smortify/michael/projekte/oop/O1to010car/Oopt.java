package com.smortify.michael.projekte.oop.O1to010car;

import com.smortify.michael.projekte.oop.O1to010car.auto.Car;
import com.smortify.michael.projekte.oop.O1to010car.auto.bauteile.motor.Motor;
import com.smortify.michael.projekte.oop.O1to010car.auto.bauteile.reifen.Tire;
import com.smortify.michael.projekte.oop.O1to010car.auto.bauteile.spiegel.Rearmirror;
import com.smortify.michael.projekte.oop.O1to010car.auto.bauteile.tank.Tank;

public class Oopt {

    public static void main(String[] args) {
        Tank t1 = new Tank(50, Tank.TYPE.DIESEL, 20);
        Motor m4 = new Motor(4, Motor.TYPE.DIESEL);
        Rearmirror r1 = new Rearmirror(100, 0);
        Rearmirror r2 = new Rearmirror(50, 20);
        Tire ti1 = new Tire(50, 70, Tire.manufacturer.HANCOCK, 3, 2);
        Tire ti2 = new Tire(50, 70, Tire.manufacturer.BADYEAR, 3, 2);
        Tire ti3 = new Tire(50, 70, Tire.manufacturer.INTERCONTINENTAL, 3, 2);
        Tire ti4 = new Tire(50, 70, Tire.manufacturer.PIRELLI, 3, 2);

        Car a4 = new Car(m4, t1, "blau", "ABCD1234!", "Audi");

        a4.addmirror(r1);
        a4.addmirror(r2);
        a4.addtires(ti1);
        a4.addtires(ti2);
        a4.addtires(ti3);
        a4.addtires(ti4);
        a4.honk(2);

        a4.drive(t1, 100);
        a4.getrange(4);
        System.out.println(a4.getMirror().get(1).getPosition());
        System.out.println(a4.getTires().get(0).getManufacturer());

    }

}
