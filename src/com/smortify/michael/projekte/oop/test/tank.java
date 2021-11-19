package com.smortify.michael.projekte.oop.test;

public class tank {
    private final int tankinhalt;
    private int fullstand;

    public tank(int fullstand, int tankinhalt) {
        this.fullstand = fullstand;
        this.tankinhalt = tankinhalt;
    }

    public int getFullstand() {
        return fullstand;
    }

    public void setFullstand(int fullstand) {
        this.fullstand = fullstand;
    }
}
