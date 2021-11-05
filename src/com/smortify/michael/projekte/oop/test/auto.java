package com.smortify.michael.projekte.oop.test;

public class auto {
    public String color;
    public double fuelConsumption;
    public String serialnumber;
    public String brand;
    public int fmount;
    public int fcons;

    public void drive(){
        this.fmount = this.fmount - this.fcons;
        System.out.println("Brrrrrrrrrrrrrrrrrrrrrr i fahr grad brrrrrrrrrr");
        System.out.println();
    };

    /*
     Füge eine Methode turboBoost() ein.
    Diese Methode prüft ob der Benzinstand größer als 10% des Tankvolumens ist.
    Wenn ja gibt die Methode den Text "SuperBoostMode" aus. Ansonsten wird "Not enough fuel to go to Superboost".
     */
    public void turboboost(){
        if (fmount > 4){
            System.out.println("SUPERBOOST");
        }
        else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }

    public void brems(){
        System.out.println("Ich bremse");
    }

    public void honk(int wh){

    }

}
