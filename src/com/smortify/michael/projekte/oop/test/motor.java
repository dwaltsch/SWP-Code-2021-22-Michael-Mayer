package com.smortify.michael.projekte.oop.test;

public class motor {
    private final int ps;
    private final TYPE type;
    private int speed;

    public motor(int ps, TYPE type) {
        this.ps = ps;
        this.type = type;
    }

    public int getSpeed() {
        return speed;
    }

    public int getPs() {
        return ps;
    }

    public void fahren(int speed, tank tank) {
        System.out.println("Brrrrrrrrr");
        tank.getfullstand();
    }

    public com.smortify.michael.projekte.oop.test.motor.TYPE getType() {
        return type;
    }

    public enum TYPE {DIESEL, BENZIN}
}


