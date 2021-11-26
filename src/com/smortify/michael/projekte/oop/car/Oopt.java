package com.smortify.michael.projekte.oop.car;
import com.smortify.michael.projekte.oop.car.auto.Car;
import com.smortify.michael.projekte.oop.car.auto.bauteile.motor.Motor;
import com.smortify.michael.projekte.oop.car.auto.bauteile.reifen.Tire;
import com.smortify.michael.projekte.oop.car.auto.bauteile.spiegel.Rearmirror;
import com.smortify.michael.projekte.oop.car.auto.bauteile.tank.Tank;

public class Oopt {

    public static void main(String[] args) {
        Tank t1 = new Tank();
        Motor m4 = new Motor(4, Motor.TYPE.DIESEL);

        Car a4 = new Car(m4, "blau", "ABCD1234!","Audi");

        a4.honk(50);
    }

}
