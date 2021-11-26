package com.smortify.michael.projekte.oop.car.auto.bauteile.tank;

public class Tank {
    private int inhalt;
    private TYPE type;
    private int adblueinhalt;

    public enum TYPE {DIESEL, BENZIN}
    public void restreichweite(int verbrauch) {

        int restreichweite = this.inhalt / verbrauch;
        System.out.println("Du hast noch Sprit für " + restreichweite + " km im Tank");
    }



}
