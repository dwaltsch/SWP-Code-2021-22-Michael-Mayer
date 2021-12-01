package com.smortify.michael.projekte.oop.car;
import com.smortify.michael.projekte.oop.car.auto.Car;
import com.smortify.michael.projekte.oop.car.auto.bauteile.motor.Motor;
import com.smortify.michael.projekte.oop.car.auto.bauteile.reifen.Tire;
import com.smortify.michael.projekte.oop.car.auto.bauteile.spiegel.Rearmirror;
import com.smortify.michael.projekte.oop.car.auto.bauteile.tank.Tank;

public class Oopt {

    public static void main(String[] args) {
        Tank t1 = new Tank(50, Tank.TYPE.DIESEL,20);
        Motor m4 = new Motor(4, Motor.TYPE.DIESEL);
        Rearmirror r1 = new Rearmirror(100,0);
        Rearmirror r2 = new Rearmirror(50,20);

        Car a4 = new Car(m4, t1,"blau", "ABCD1234!","Audi");
        a4.addmirror(r1);
        a4.addmirror(r2);
        a4.honk(2);
        a4.drive(t1, 100);
        a4.getrange(4);
        System.out.println(a4.getMirror().get(1).getPosition());
    }

}
