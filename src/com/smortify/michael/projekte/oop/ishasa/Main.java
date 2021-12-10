package com.smortify.michael.projekte.oop.ishasa;

import com.smortify.michael.projekte.oop.ishasa.zoo.Zoo;
import com.smortify.michael.projekte.oop.ishasa.zoo.animal.Animal;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal(40,20);
        Animal a2 = new Animal(50,30);

        Zoo zoo = new Zoo("Kinderzoo", "Grosestrase");
        zoo.addAnimal(a1);
        zoo.addAnimal(a2);
        zoo.printAnimal();
    }
}