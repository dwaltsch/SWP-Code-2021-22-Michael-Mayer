package com.smortify.michael.projekte.oop;
import com.smortify.michael.projekte.oop.test.auto;

public class oopt {
    public static void main(String[] args) {
        auto a1 = new auto();
        a1.brand = "Audi";
        a1.fuelConsumption = 6.7;

        auto a4 = new auto();
        a4.brand = "Audi";
        a4.fuelConsumption = 10;
        a4.fmount = 45;
        a4.drive();
        a4.brems();
        a4.turboboost();

    }
}
