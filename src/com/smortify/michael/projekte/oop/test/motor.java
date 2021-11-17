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
        System.out.println("Da motor läuft mit");
    }
}
