package com.smortify.michael.projekte.oop.cars;

import com.smortify.michael.projekte.oop.cars.car.Car;
import com.smortify.michael.projekte.oop.cars.car.manufacturer.Manufacturer;
import com.smortify.michael.projekte.oop.cars.car.parts.engine.Engine;

public class Oopt {
    public static void main(String[] args) {
        Manufacturer manufacturer = new Manufacturer(Manufacturer.manufacturer.Gaudi, Manufacturer.origincountry.PIEFKELAND, 5);
        Engine engine = new Engine(Engine.fuelType.Diesel, 500);
        Car car = new Car(70000, 200, 100, 5, engine, manufacturer);
        System.out.println(car.getPrice());
        car.drive(500);
        car.printMileage();
    }
}
