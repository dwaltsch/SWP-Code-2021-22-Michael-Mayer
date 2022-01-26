package com.smortify.michael.projekte.oop.O15ishasa.zoo;

import com.smortify.michael.projekte.oop.O15ishasa.zoo.animal.Animal;

import java.util.ArrayList;
import java.util.List;

public class Zoo {
    private String name;
    private String street;
    private List<Animal> animals;


    public Zoo(String name, String street) {
        this.name = name;
        this.street = street;
        this.animals = new ArrayList<>();
    }

    public void makeShow() {
        System.out.println("The show has just started");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public void addAnimal(Animal animal) {
        this.animals.add(animal);
    }

    public void printAnimal() {
        for (Animal animal : this.animals) {
            System.out.println("Vieh " + animal.getHeight() + " " + animal.getWeight() + " ");
        }
    }
}
