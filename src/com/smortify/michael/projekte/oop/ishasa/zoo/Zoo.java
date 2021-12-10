package com.smortify.michael.projekte.oop.ishasa.zoo;

public class Zoo {
    private String name;
    private String street;

    public void makeShow(){
        System.out.println("The show has just started");
    }
    public Zoo(String name, String street) {
        this.name = name;
        this.street = street;
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
}
