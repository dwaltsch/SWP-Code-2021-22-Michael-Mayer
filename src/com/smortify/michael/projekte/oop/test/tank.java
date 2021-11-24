package com.smortify.michael.projekte.oop.test;

public class tank {
    private int fullstand;
    private final int tankinhalt;

    public tank(int fullstand, int tankinhalt) {
        this.setFullstand(fullstand);
        this.tankinhalt = tankinhalt;
    }


    public int getFullstand() {
        return fullstand;

    }

    public void setFullstand(int fullstand) {
        this.fullstand = fullstand;

    }

    public int getTankinhalt() {
        return tankinhalt;

    }
}
