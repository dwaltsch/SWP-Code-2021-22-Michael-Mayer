package com.smortify.michael.projekte.oop.O16phone.sim;

public class Sim {
    private int id;
    private String CountryCode;
    private String number;

    public Sim(int id, String CountryCode, String number) {
        this.id = id;
        this.CountryCode = CountryCode;
        this.number = number;
    }

    public void doCall(String Tel, Sim sim) {
        System.out.println("Calling " + Tel + " from " + sim.CountryCode + sim.number);
    }
}
