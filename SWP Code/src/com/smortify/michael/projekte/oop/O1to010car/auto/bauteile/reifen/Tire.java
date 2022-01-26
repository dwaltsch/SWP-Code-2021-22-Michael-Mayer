package com.smortify.michael.projekte.oop.O1to010car.auto.bauteile.reifen;

public class Tire {
    private final int abnutzung;
    private final int size;
    private final manufacturer manufacturer;
    private final int alter;
    private final int profil;

    public Tire(int abnutzung, int size, manufacturer manufacturer, int alter, int profil) {
        this.abnutzung = abnutzung;
        this.size = size;
        this.manufacturer = manufacturer;
        this.alter = alter;
        this.profil = profil;
    }

    public int getAbnutzung() {
        return abnutzung;
    }

    public int getSize() {
        return size;
    }

    public Tire.manufacturer getManufacturer() {
        return manufacturer;
    }

    public int getAlter() {
        return alter;
    }

    public int getProfil() {
        return profil;
    }

    public enum manufacturer {PIRELLI, MICHAELIN, INTERCONTINENTAL, HANCOCK, BADYEAR, VEGA,}
}
