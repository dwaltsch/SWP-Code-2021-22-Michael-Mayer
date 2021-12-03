package com.smortify.michael.projekte.oop.car2;

import com.smortify.michael.projekte.oop.car2.car.Car;
import com.smortify.michael.projekte.oop.car2.car.manufacturer.Manufacturer;
import com.smortify.michael.projekte.oop.car2.car.parts.engine.Engine;

public class Oopt {
    public static void main(String[] args) {
        Manufacturer manufacturer = new Manufacturer(Manufacturer.manufacturer.Fort, Manufacturer.origincountry.Amiland)
        Engine engine = new Engine(Engine.fuelType.Diesel,500);
        Car car = new Car(200,10000,50,engine,manufacturer);
    }
}
