package com.smortify.michael.projekte.oop;
import com.smortify.michael.projekte.oop.test.auto;
import com.smortify.michael.projekte.oop.test.motor;
import com.smortify.michael.projekte.oop.test.tank;

public class oopt {

    public static void main(String[] args) {
        motor m4 = new motor(50, motor.TYPE.DIESEL);
        tank c4 = new tank(30,50);

        auto a4 = new auto(m4,"Audi","blau","ABCD1234!",3.9);
        a4.drive(10);
        /* a4.brems();
        a4.turboboost();
        a4.honk(5);

        a4.getremrange();

         */
    }
}
