package com.smortify.michael.projekte.oop.O15ishasa;

import com.smortify.michael.projekte.oop.O15ishasa.zoo.Zoo;
import com.smortify.michael.projekte.oop.O15ishasa.zoo.animal.Animal;
import com.smortify.michael.projekte.oop.O15ishasa.zoo.animal.dog.Dog;

public class Main {
    public static void main(String[] args) {
        Animal a1 = new Animal(40, 20);
        Animal a2 = new Animal(50, 30);

        Zoo zoo = new Zoo("Kinderzoo", "Grosestrase");
        zoo.addAnimal(a1);
        zoo.addAnimal(a2);
        zoo.printAnimal();

        Dog d1 = new Dog(50, 100);
        d1.bark();

        zoo.addAnimal(d1);
        zoo.printAnimal();
    }
}
