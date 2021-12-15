package com.smortify.michael.projekte.oop.ishasa.zoo.animal.dog;

import com.smortify.michael.projekte.oop.ishasa.zoo.animal.Animal;

public class Dog extends Animal {
    public Dog(int weight, int height) {
        super(weight, height);
    }

    public void bark() {
        System.out.println("Wuff ?");
    }
}

