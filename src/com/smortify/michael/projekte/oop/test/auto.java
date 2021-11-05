package com.smortify.michael.projekte.oop.test;

public class auto {
    public String color;
    public double fuelConsumption;
    public String serialnumber;
    public String brand;
    public int fmount = 45;
    public int fcons;

    public auto(String b, String col , String sn,double fl){
        this.brand = b;
        this.serialnumber = sn;
        this.color = col;
        this.fuelConsumption = fl;

    }

    public void drive(){
        this.fmount = (int) (this.fmount - this.fuelConsumption);
        System.out.println("Brrrrrrrrrrrrrrrrrrrrrr i fahr grad brrrrrrrrrr");
        System.out.println();
    };

    /*
     Füge eine Methode turboBoost() ein.
    Diese Methode prüft ob der Benzinstand größer als 10% des Tankvolumens ist.
    Wenn ja gibt die Methode den Text "SuperBoostMode" aus. Ansonsten wird "Not enough fuel to go to Superboost".
     */
    public void turboboost(){
        if (this.fmount > 4){
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
        for (int i = 0; i < wh; i++) {
            System.out.println("Tuut");
        }
    }
    public void getremrange(){
         int restreichweite = (int) ((fmount / fuelConsumption)*100);

        System.out.println("Die restliche Reichweite beträgt " + restreichweite + " km");
    }

}
