package com.smortify.michael.projekte.oop.test;

public class motor {
    public enum TYPE{DIESEL,BENZIN}
    private int ps;
    private TYPE type;

    public motor(int ps, TYPE type) {
        this.ps = ps;
        this.type = type;
    }

    public int getPs() {
        return ps;
    }

    public void fahren(int anzahl){
        System.out.println("Da motor läuft mit"+ anzahl);
    }

    public com.smortify.michael.projekte.oop.test.motor.TYPE getType() {
        return type;
    }
}


