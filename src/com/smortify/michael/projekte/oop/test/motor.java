package com.smortify.michael.projekte.oop.test;

public class motor {
    private enum TYPE{DIESEL,BENZIN}
    private int ps;
    private TYPE type;

    public motor(int ps, TYPE type) {
        this.ps = ps;
        this.type = type;
    }

    public void fahren(int anzahl){
        System.out.println("Da motor läuft mit"+ anzahl);
    }

    public int getPs() {

        return ps;
    }

    public com.smortify.michael.projekte.oop.test.motor.TYPE getType() {
        return type;
    }
}

