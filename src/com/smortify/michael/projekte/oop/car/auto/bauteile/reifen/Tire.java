package com.smortify.michael.projekte.oop.car.auto.bauteile.reifen;

public class Tire {
    private int abnutzung;
    private int size;
    private manufacturer manufacturer;
    public enum manufacturer {PIRELLI, MICHAELIN,INTERCONTINENTAL,HANCOCK,BADYEAR,VEGA,}
    private int alter;
    private int profil;

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
}
