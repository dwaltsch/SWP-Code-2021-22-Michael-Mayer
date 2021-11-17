package com.smortify.michael.projekte.oop;
import com.smortify.michael.projekte.oop.test.auto;
import com.smortify.michael.projekte.oop.test.motor;

public class oopt {

    public static void main(String[] args) {
        motor m4 = new motor(50, motor.TYPE.DIESEL);

        auto a4 = new auto(m4,"blau","ABCD1234!",3.9);
        a4.drive();
        a4.brems();
        a4.turboboost();
        a4.honk(5);

        a4.getremrange();
    }
}
