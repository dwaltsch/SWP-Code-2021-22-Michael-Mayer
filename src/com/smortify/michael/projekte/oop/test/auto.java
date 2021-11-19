package com.smortify.michael.projekte.oop.test;

public class auto {
    public String color;
    private final int fmount = 45;
    public double fuelConsumption;
    public String serialnumber;
    public String brand;
    public int fcons;
    public int geschwindigkeit;

    private motor motor;
    private tank tank;


    public auto(tank tank, motor motor, String b, String col, String sn, double fl) {
        this.motor = motor;
        this.brand = b;
        this.serialnumber = sn;
        this.color = col;
        this.fuelConsumption = fl;

    }

    public auto(com.smortify.michael.projekte.oop.test.tank tank, com.smortify.michael.projekte.oop.test.motor i, String blau, String col, double v) {
    }

    public void drive(int geschwindigkeit , tank) {
        this.motor.fahren(geschwindigkeit , tank);
    }

    /*
     Füge eine Methode turboBoost() ein.
    Diese Methode prüft ob der Benzinstand größer als 10% des Tankvolumens ist.
    Wenn ja gibt die Methode den Text "SuperBoostMode" aus. Ansonsten wird "Not enough fuel to go to Superboost".
     */

    public void turboboost() {
        if (this.tank.getFullstand() > 4) {
            System.out.println("SUPERBOOST");
        } else {
            System.out.println("Not enough fuel to go to Superboost");
        }
    }


    public void brems() {
        System.out.println("Ich bremse");
    }

    public void honk(int wh) {
        for (int i = 0; i < wh; i++) {
            System.out.println("Tuut");
        }
        System.out.println("I bin an " + this.brand + " hab die farbe " + this.color + " und I schluck " + this.getMotor().getType() + this.tank.getFullstand());
    }

    public void getremrange() {
        int restreichweite = (int) ((fmount / fuelConsumption) * 100);

        System.out.println("Die restliche Reichweite beträgt " + restreichweite + " km");
    }

    public motor getMotor() {
        return motor;
    }

    public void setMotor(motor motor) {
        this.motor = motor;
    }

    public com.smortify.michael.projekte.oop.test.tank getTank() {
        return tank;
    }

    public void setTank(com.smortify.michael.projekte.oop.test.tank tank) {
        this.tank = tank;
    }
}
