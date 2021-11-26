package com.smortify.michael.projekte.oop.car.auto.bauteile.tank;

public class Tank {
    private int inhalt;
    private TYPE type;
    private int adblueinhalt;


    public enum TYPE {DIESEL, BENZIN}

    public void restreichweite(int verbrauch) {

        int restreichweite = this.inhalt / verbrauch * 100;
        System.out.println("Du hast noch Sprit für " + restreichweite + " km im Tank");
    }

    public Tank(int inhalt, TYPE type, int adblueinhalt) {
        this.inhalt = inhalt;
        this.type = type;
        this.adblueinhalt = adblueinhalt;
    }

    public void setInhalt(int inhalt) {
        this.inhalt = inhalt;
    }

    public int getInhalt() {
        return inhalt;
    }

    public void setAdblueinhalt(int adblueinhalt) {
        this.adblueinhalt = adblueinhalt;
    }
}
