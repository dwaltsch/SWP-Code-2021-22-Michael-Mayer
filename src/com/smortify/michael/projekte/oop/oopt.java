package com.smortify.michael.projekte.oop;
import com.smortify.michael.projekte.oop.test.auto;

public class oopt {
    public static void main(String[] args) {

        auto a4 = new auto("Audi","blau","ABCD1234!",3.9);
        a4.drive();
        a4.brems();
        a4.turboboost();
        a4.honk(5);

        a4.getremrange();
    }
}