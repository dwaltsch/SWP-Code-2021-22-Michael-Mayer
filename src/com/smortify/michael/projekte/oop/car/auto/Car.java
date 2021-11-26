package com.smortify.michael.projekte.oop.car.auto;

import com.smortify.michael.projekte.oop.car.auto.bauteile.motor.Motor;
import com.smortify.michael.projekte.oop.car.auto.bauteile.reifen.Tire;
import com.smortify.michael.projekte.oop.car.auto.bauteile.spiegel.Rearmirror;
import com.smortify.michael.projekte.oop.car.auto.bauteile.tank.Tank;

public class Car {

    private Motor motor;
    private Tank tank;
    private String color;
    private String serial;
    private String brand;

    public Car(Motor motor, Tank tank, String color, String serial, String brand) {
        this.motor = motor;
        this.tank = tank;
        this.color = color;
        this.serial = serial;
        this.brand = brand;
    }



    public void drive(Tank tank, int speed) {
        motor.drive(tank,speed);

    }
    ;


    public void breakcar() {
        System.out.println("Ich bremse");
    };

    public void getrange(int verbrauch) {
        tank.restreichweite(verbrauch);
    };

    public void honk(int amnt) {
        for (int i = 0; i < amnt; i++) {
            System.out.println("Honk honk");
        }
    }

    public void tanken(int fuelvariant , int amount){
        if(fuelvariant == 1){
            // Benzin
        }
        else if(fuelvariant == 2){
            // Diesel
        }
        else if (fuelvariant == 3){
            // AdBlau
        }
    };


}

