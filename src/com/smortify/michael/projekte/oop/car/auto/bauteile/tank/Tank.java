package com.smortify.michael.projekte.oop.car.auto.bauteile.tank;

public class Tank {
    private final TYPE type;
    private int inhalt;
    private int adblueinhalt;


    public Tank(int inhalt, TYPE type, int adblueinhalt) {
        this.inhalt = inhalt;
        this.type = type;
        this.adblueinhalt = adblueinhalt;
    }

    public void restreichweite(int verbrauch) {

        int restreichweite = this.inhalt / verbrauch * 100;
        System.out.println("Du hast noch Sprit für " + restreichweite + " km im Tank");
    }

    public int getInhalt() {
        return inhalt;
    }

    public void setInhalt(int inhalt) {
        this.inhalt = inhalt;
    }

    public void setAdblueinhalt(int adblueinhalt) {
        this.adblueinhalt = adblueinhalt;
    }

    public enum TYPE {DIESEL, BENZIN}
}
