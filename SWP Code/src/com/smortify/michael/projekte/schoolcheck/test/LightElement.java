package com.smortify.michael.projekte.schoolcheck.test;

public class LightElement {
    private String Name;
    private String Color;
    private int Powerusage;
    private boolean status = false; // false ist aus true ist Lampe an

    public LightElement(String name, String color, int powerusage) {
        Name = name;
        Color = color;
        Powerusage = powerusage;
        status = status;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public int getPowerusage() {
        return Powerusage;
    }

    public void setPowerusage(int powerusage) {
        Powerusage = powerusage;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public void turnOn() {
        if (this.isStatus() == false) {
            this.setStatus(true);
            this.setPowerusage(this.getPowerusage() + 5);
            System.out.printf("Ich habe mich eingeschaltet momentaner Stromverbrauch " + this.getPowerusage() + " Watt");
        } else if (this.isStatus() == true) {
            System.out.printf("Mein Name ist " + this.getName() + " und ich bin bereits eingeschaltet");
        }
    }

    public void turnOff() {
        this.status = false;
    }
}
