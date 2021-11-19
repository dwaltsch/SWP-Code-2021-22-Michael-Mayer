package com.smortify.michael.projekte.oop.test;

public class motor {
    public enum TYPE{DIESEL,BENZIN}
    private int ps;
    private TYPE type;
    private int speed;
    public motor(int ps, TYPE type) {
        this.ps = ps;
        this.type = type;
    }

    public int getPs() {
        return ps;
    }

    public void fahren(int speed){
        if(speed > 50){

        }

    }

    public com.smortify.michael.projekte.oop.test.motor.TYPE getType() {
        return type;
    }
}


