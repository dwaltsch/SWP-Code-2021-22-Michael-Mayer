package com.smortify.michael.projekte.oop.car.auto;

import com.smortify.michael.projekte.oop.car.auto.bauteile.motor.motor;
import com.smortify.michael.projekte.oop.car.auto.bauteile.reifen.reifen;
import com.smortify.michael.projekte.oop.car.auto.bauteile.spiegel.ruckspiegel;
import com.smortify.michael.projekte.oop.car.auto.bauteile.tank.tank;

public class auto {
private String color;
private String serial;

tank t1 = new tank();
motor m4  = new motor();

reifen r1 = new reifen();
ruckspiegel ruk1 = new ruckspiegel();

public void drive(){


};

public void brk(){

};

public void grange(int verbrauch){
t1.restreichweite(verbrauch);
};

public void honk(int amnt){
    for (int i = 0; i < amnt; i++) {
        System.out.println("Fahr mol a klele");
    }
}

}

